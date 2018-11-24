package com.rick.demoLogic.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rick.demoLogic.model.LogicUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;

@Component
public interface LogicMapper extends BaseMapper<LogicUser>{
    void updateUserById(Integer id);
}
