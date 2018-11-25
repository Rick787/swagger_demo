package com.rick.demoLogic.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * 文 件 名:User<br/>
 * 文件描述: 对象<br/>
 * 修 改 人: rick <br/>
 * 修改日期:2018-11-25<br/>
 * 修改内容:<br/>
 */

@TableName("user")
public class User extends Model<User>{

    private static final long serialVersionUID = 1L;


    /** 主键id **/
    @TableId(type = IdType.AUTO)
    private Integer id;

    /** 用户名 **/
    private String username;

    /** 密码 **/
    private String password;

    /** 昵称 **/
    private String nickname;

    /** 删除标记： 默认0 未删除 1 已删除 **/
    @TableField("del_flag")
    private Integer delFlag;


    /**
     * 获取主键id
     *
     * @return 主键id
     */
    public Integer getId(){
        return id;
    }

    /**
     * 设值主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id){
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return 用户名
     */
    public String getUsername(){
        return username;
    }

    /**
     * 设值用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username){
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return 密码
     */
    public String getPassword(){
        return password;
    }

    /**
     * 设值密码
     *
     * @param password 密码
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * 获取昵称
     *
     * @return 昵称
     */
    public String getNickname(){
        return nickname;
    }

    /**
     * 设值昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    /**
     * 获取删除标记： 默认0 未删除 1 已删除
     *
     * @return 删除标记： 默认0 未删除 1 已删除
     */
    public Integer getDelFlag(){
        return delFlag;
    }

    /**
     * 设值删除标记： 默认0 未删除 1 已删除
     *
     * @param delFlag 删除标记： 默认0 未删除 1 已删除
     */
    public void setDelFlag(Integer delFlag){
        this.delFlag = delFlag;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
