package com.rick.demoLogic.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@TableName("pub_department")
public class DepartmentVO extends Model<DepartmentVO>{
    private static final long serialVersionUID = 1L;

    /**
     * 部门ID
     **/
    private Integer id;

    @TableField("corp_id")
    private Integer corpId;

    public Integer getCorpId() {
        return corpId;
    }

    public void setCorpId(Integer corpId) {
        this.corpId = corpId;
    }

    /**
     * 子集，不放在數據庫中
     **/
    @TableField(exist = false)
    private List<DepartmentVO> childList = new ArrayList<>();

    public List<DepartmentVO> getChildList() {
        return childList;
    }

    public void setChildList(List<DepartmentVO> childList) {
        this.childList = childList;
    }

    /**
     * 部门名称
     **/
    private String name;

    /**
     * 父ID
     **/
    @TableField("parent_id")
    private Integer parentId;


    /**
     * 创建人
     **/
    private Integer creator;

    /**
     * 修改人
     **/
    private Integer modifier;

    /**
     * 部门全路径
     **/
    @TableField("full_path")
    private String fullPath;

    /**
     * 部门层级
     **/
    private Integer level;

    /**
     * 部门编码
     **/
    private String code;


    /**
     * 刪除標記
     **/

    @TableField("is_del")
    private Integer isDel;


    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取部门ID
     *
     * @return 部门ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设值部门ID
     *
     * @param id 部门ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取部门名称
     *
     * @return 部门名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设值部门名称
     *
     * @param name 部门名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取父ID
     *
     * @return 父ID
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设值父ID
     *
     * @param parentId 父ID
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }


    /**
     * 获取创建人
     *
     * @return 创建人
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * 设值创建人
     *
     * @param creator 创建人
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * 获取修改人
     *
     * @return 修改人
     */
    public Integer getModifier() {
        return modifier;
    }

    /**
     * 设值修改人
     *
     * @param modifier 修改人
     */
    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    /**
     * 获取部门全路径
     *
     * @return 部门全路径
     */
    public String getFullPath() {
        return fullPath;
    }

    /**
     * 设值部门全路径
     *
     * @param fullPath 部门全路径
     */
    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    /**
     * 获取部门层级
     *
     * @return 部门层级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设值部门层级
     *
     * @param level 部门层级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取部门编码
     *
     * @return 部门编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设值部门编码
     *
     * @param code 部门编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }
}

