/*
 * Copyright 2016 XDecorator. All rights reserved.
 *
 */

package com.rick.demoLogic.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rick.demoLogic.model.DepartmentVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 文 件 名:DepartmentMapper<br/>
 * 文件描述: 持久化操作<br/>
 * 修 改 人: wuqian <br/>
 * 修改日期:2018-12-20<br/>
 * 修改内容:<br/>
 */
@Component
public interface DepartmentMapper extends BaseMapper<DepartmentVO>{

 List<DepartmentVO> selectListByParentCode(@Param("code") String code, @Param("corpId") Integer corpId);

 List<DepartmentVO> queryTreesByCorpId(Integer corpId);
}

