package com.rick.demoLogic.service;

import com.baomidou.mybatisplus.service.IService;
import com.rick.demoLogic.model.LogicUser;

import javax.validation.constraints.NotNull;


public interface ILogicService extends IService<LogicUser>{
    void updateUserById(Integer id);
}
