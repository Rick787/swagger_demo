package com.rick.demoLogic.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rick.demoLogic.mapper.LogicMapper;
import com.rick.demoLogic.model.LogicUser;
import com.rick.demoLogic.service.ILogicService;
import org.springframework.stereotype.Service;

@Service
public class LogicServiceImpl extends ServiceImpl<LogicMapper,LogicUser> implements ILogicService {

}
