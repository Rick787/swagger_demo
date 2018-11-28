package com.rick.demoLogic.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rick.demoLogic.model.LogicFile;
import org.springframework.stereotype.Component;

@Component
public interface LogicFileMapper extends BaseMapper<LogicFile>{
    void deletePhotoById(Integer id);
}
