package com.rick.demoLogic.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rick.demoLogic.model.User;
import org.springframework.stereotype.Component;

/**
 * 文 件 名:UserMapper<br/>
 * 文件描述: 持久化操作<br/>
 * 修 改 人: rick <br/>
 * 修改日期:2018-11-25<br/>
 * 修改内容:<br/>
 */

@Component
public interface UserMapper extends BaseMapper<User> {
}
