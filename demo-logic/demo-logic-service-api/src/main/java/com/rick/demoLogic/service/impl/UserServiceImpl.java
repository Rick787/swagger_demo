package com.rick.demoLogic.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rick.demoLogic.mapper.UserMapper;
import com.rick.demoLogic.model.User;
import com.rick.demoLogic.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {
}
