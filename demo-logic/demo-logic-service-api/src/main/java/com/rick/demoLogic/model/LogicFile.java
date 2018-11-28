package com.rick.demoLogic.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

@TableName("logic_file")
public class LogicFile extends Model<LogicFile>{
    private static final long serialVersionUID = 1L;

    /** 主键ID **/
    @TableId(type = IdType.AUTO)
    private Integer id;

    /** 文件路径 **/
    @TableField("file_path")
    private String filePath;

    /** 文件描述 **/
    private String description;

    /** 添加时间 **/
    @TableField("add_time")
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date addTime;

    /** 删除标记： 默认0 未删除 1：已删除 **/
    @TableField("del_flag")
    private Integer delFlag;


    /**
     * 获取主键ID
     *
     * @return 主键ID
     */
    public Integer getId(){
        return id;
    }

    /**
     * 设值主键ID
     *
     * @param id 主键ID
     */
    public void setId(Integer id){
        this.id = id;
    }

    /**
     * 获取文件路径
     *
     * @return 文件路径
     */
    public String getFilePath(){
        return filePath;
    }

    /**
     * 设值文件路径
     *
     * @param filePath 文件路径
     */
    public void setFilePath(String filePath){
        this.filePath = filePath;
    }

    /**
     * 获取文件描述
     *
     * @return 文件描述
     */
    public String getDescription(){
        return description;
    }

    /**
     * 设值文件描述
     *
     * @param description 文件描述
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * 获取添加时间
     *
     * @return 添加时间
     */
    public Date getAddTime(){
        return addTime;
    }

    /**
     * 设值添加时间
     *
     * @param addTime 添加时间
     */
    public void setAddTime(Date addTime){
        this.addTime = addTime;
    }

    /**
     * 获取删除标记： 默认0 未删除 1：已删除
     *
     * @return 删除标记： 默认0 未删除 1：已删除
     */
    public Integer getDelFlag(){
        return delFlag;
    }

    /**
     * 设值删除标记： 默认0 未删除 1：已删除
     *
     * @param delFlag 删除标记： 默认0 未删除 1：已删除
     */
    public void setDelFlag(Integer delFlag){
        this.delFlag = delFlag;
    }
    @Override
    protected Serializable pkVal() {
        return null;
    }
}
