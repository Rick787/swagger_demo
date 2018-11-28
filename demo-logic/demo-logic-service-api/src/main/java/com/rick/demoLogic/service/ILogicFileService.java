package com.rick.demoLogic.service;

import com.baomidou.mybatisplus.service.IService;
import com.rick.demoLogic.model.LogicFile;

public interface ILogicFileService extends IService<LogicFile>{
    void deletePhotoById(Integer id);
}
