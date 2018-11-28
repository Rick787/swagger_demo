package com.rick.demoLogic.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rick.demoLogic.mapper.LogicFileMapper;
import com.rick.demoLogic.model.LogicFile;
import com.rick.demoLogic.service.ILogicFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogicFileServiceImpl extends ServiceImpl<LogicFileMapper,LogicFile> implements ILogicFileService{
    @Autowired
    private LogicFileMapper logicFileMapper;

    @Override
    public void deletePhotoById(Integer id) {
        logicFileMapper.deletePhotoById(id);
    }
}
