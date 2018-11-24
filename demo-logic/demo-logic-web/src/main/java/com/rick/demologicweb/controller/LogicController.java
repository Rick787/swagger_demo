package com.rick.demologicweb.controller;

import com.rick.demoLogic.model.LogicUser;
import com.rick.demoLogic.service.ILogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
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

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/save.do",method = RequestMethod.POST)
    public String save(LogicUser logicUser){
        try {
            logicService.insert(logicUser);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

}
