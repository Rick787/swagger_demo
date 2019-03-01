package com.rick.demologicweb.controller;

import com.alibaba.fastjson.JSON;
import com.rick.demoLogic.model.DepartmentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestTreeNodes treeNodes;



    public static void main(String[] args) throws IOException {
        //测试流
        TestController.listFile("D://code");


//        person person1 = new personImpl();
//        person1.getname("hahah");
//        person1.run();
//
//        person.sayhello();
//        test(() -> System.out.println("123"));
//
//        test(() -> System.out.println("hahah"));
//        try {
//
//            Method method = personImpl.class.getMethod("sayHi");
//            System.out.println(method.getAnnotationsByType(Schedule.class));
//            for (Schedule schedule : method.getAnnotationsByType(Schedule.class)) {
//                System.out.println(schedule.dayOfWeek());
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    public static void listFile(String path) throws IOException {
        if (path == null) {
            return;// 因为下面的new File如果path为空，回报异常
        }
        File[] files = new File(path).listFiles();
        if (files == null) {
            return;
        }
        for(File file : files) {
            if (file.isFile()) {
                if (file.getName().equals("FileMapper.xml")){
                    Reader reader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(reader);
                    while (bufferedReader.readLine() != null){
                        System.out.println(bufferedReader.readLine());
                    }
                    return;
                }
                System.out.println(file.getName());
            } else if (file.isDirectory()) {
                System.out.println("Directory:"+file.getName());
                listFile(file.getPath());
            } else {
                System.out.println("Error");
            }
        }
    }




    public static void test(person person) {
        person.run();
        person.getname("aaa");
    }

    @RequestMapping("/test/getTreeNodes")
    public String getTreeNodes(){
        List<DepartmentVO> list = treeNodes.queryTreesByCorpId(111);
        return JSON.toJSONString(list);
    }

    /**
     * 测试递归迭代出所有子集
     * 核心思想：找到根节点
     * */
    @RequestMapping("/test")
    public List<DepartmentVO> getTreeNode(){
        List<DepartmentVO> list = treeNodes.queryTreesByCorpId(111);
        List<DepartmentVO> result = new ArrayList<>();
        for (DepartmentVO departmentVO : list) {
            if (departmentVO.getParentId() == 0){
                //找到根节点
                //把他塞到集合里，再继续找他的子集
                result.add(departmentVO);
                getChildList(list,departmentVO);
            }
        }
        return result;
    }


    private void getChildList(List<DepartmentVO> list, DepartmentVO departmentVO) {
        for (DepartmentVO vo : list) {
            if (vo.getParentId().equals(departmentVO.getId())){
                //确定为子集
                departmentVO.getChildList().add(vo);
                //继续找子集的子集
                getChildList(list,vo);
            }
        }
    }
}
