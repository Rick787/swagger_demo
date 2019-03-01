package com.rick.demologicweb.controller;

import com.rick.demoLogic.mapper.DepartmentMapper;
import com.rick.demoLogic.model.DepartmentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestTreeNodes {

    @Autowired
    private DepartmentMapper departmentMapper;

    public List<DepartmentVO> queryTreesByCorpId(Integer corpId) {
        List<DepartmentVO> departmentList = departmentMapper.queryTreesByCorpId(corpId);
        return departmentList;
    }

}
