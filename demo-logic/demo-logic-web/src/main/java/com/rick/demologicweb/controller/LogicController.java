package com.rick.demologicweb.controller;

import com.rick.demoLogic.model.LogicUser;
import com.rick.demoLogic.service.ILogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logic")
public class LogicController {

    @Autowired
    private ILogicService logicService;

    @RequestMapping("/saveUser")
    public String saveUser(LogicUser logicUser){
        try {
            logicService.insert(logicUser);
            return "添加成功";
        }catch (Exception e){
            e.printStackTrace();
            return "添加失敗";
        }
    }

}
