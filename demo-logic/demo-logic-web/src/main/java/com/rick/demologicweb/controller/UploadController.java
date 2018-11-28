package com.rick.demologicweb.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.region.Region;
import com.rick.demoLogic.model.LogicFile;
import com.rick.demoLogic.service.ILogicFileService;
import com.rick.demoLogic.utils.TencentOssUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/upload")
public class UploadController{

    @Autowired
    private ILogicFileService logicFileService;

    @RequestMapping(value = "/upload.do",method = RequestMethod.POST)
    public String uploadFile(MultipartFile multipartFile, String description) throws IOException {
        // 获取文件名
        String fileName = multipartFile.getOriginalFilename();
        // 获取文件后缀
        String prefix=fileName.substring(fileName.lastIndexOf("."));
        // 用uuid作为文件名，防止生成的临时文件重复
        final File file = File.createTempFile(UUID.randomUUID().toString(), prefix);
        // MultipartFile to File
        multipartFile.transferTo(file);

        //你的业务逻辑
        Boolean result = uploadToTencentOss(file);
        if (result){
            LogicFile logicFile = new LogicFile();
            logicFile.setAddTime(new Date());
            logicFile.setDescription(description);
            logicFile.setFilePath(TencentOssUtils.tencentOssPath+file.getName());
            //插入數據庫
            logicFileService.insert(logicFile);
            return "上傳成功";
        }else {
            return "上傳失敗";
        }
    }

    @RequestMapping("/queryPhotoList.do")
    public ModelAndView queryPhotoList(Model model){
        try {
            Wrapper<LogicFile> wrapper = new EntityWrapper<>();
            wrapper.eq("del_flag",0);
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("fileList",logicFileService.selectList(wrapper));
            modelAndView.setViewName("photoList");
            return modelAndView;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/deletePhoto.do")
    public String deletePhoto(Integer id){
        try {
            logicFileService.deletePhotoById(id);
            return "刪除成功";
        }catch (Exception e){
            e.printStackTrace();
            return "刪除失敗";
        }
    }

    public boolean uploadToTencentOss(File file){
        try {
            // 1 初始化用户身份信息(secretId, secretKey)
            COSCredentials cred = new BasicCOSCredentials(TencentOssUtils.secretId, TencentOssUtils.secretKey);
            // 2 设置bucket的区域, COS地域的简称请参照 https://cloud.tencent.com/document/product/436/6224
            // clientConfig中包含了设置region, https(默认http), 超时, 代理等set方法, 使用可参见源码或者接口文档FAQ中说明
            ClientConfig clientConfig = new ClientConfig(new Region(TencentOssUtils.tencentOssRegion));
            // 3 生成cos客户端
            COSClient cosClient = new COSClient(cred, clientConfig);
            // bucket的命名规则为{name}-{appid} ，此处填写的存储桶名称必须为此格式
            String bucketName = TencentOssUtils.tencentOssBucketName;

            // 指定要上传到 COS 上对象键
            // 对象键（Key）是对象在存储桶中的唯一标识。例如，在对象的访问域名 `bucket1-1250000000.cos.ap-guangzhou.myqcloud.com/doc1/pic1.jpg` 中，对象键为 doc1/pic1.jpg, 详情参考 [对象键](https://cloud.tencent.com/document/product/436/13324)
            String key = file.getName();
            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, file);
            // 上傳文件到雲端
            cosClient.putObject(putObjectRequest);
            // 關閉client
            cosClient.shutdown();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
