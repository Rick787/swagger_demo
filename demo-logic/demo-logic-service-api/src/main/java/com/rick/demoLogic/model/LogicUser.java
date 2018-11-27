package com.rick.demoLogic.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

@TableName("student")
public class LogicUser extends Model<LogicUser>{

    private static final long serialVersionUID = 1L;

    /**  **/
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**  **/
    private String name;

    /**  **/
    private Integer age;

    /**  **/
    private String address;

    /**  **/
    private String remark;

    /**  **/
    @TableField("del_flag")
    private Integer delFlag;


    /**
     * 获取
     *
     * @return
     */
    public Integer getId(){
        return id;
    }

    /**
     * 设值
     *
     * @param id
     */
    public void setId(Integer id){
        this.id = id;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getName(){
        return name;
    }

    /**
     * 设值
     *
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * 获取
     *
     * @return
     */
    public Integer getAge(){
        return age;
    }

    /**
     * 设值
     *
     * @param age
     */
    public void setAge(Integer age){
        this.age = age;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getAddress(){
        return address;
    }

    /**
     * 设值
     *
     * @param address
     */
    public void setAddress(String address){
        this.address = address;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getRemark(){
        return remark;
    }

    /**
     * 设值
     *
     * @param remark
     */
    public void setRemark(String remark){
        this.remark = remark;
    }

    /**
     * 获取
     *
     * @return
     */
    public Integer getDelFlag(){
        return delFlag;
    }

    /**
     * 设值
     *
     * @param delFlag
     */
    public void setDelFlag(Integer delFlag){
        this.delFlag = delFlag;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
