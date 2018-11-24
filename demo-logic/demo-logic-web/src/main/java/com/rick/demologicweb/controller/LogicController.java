package com.rick.demologicweb.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.rick.demoLogic.model.LogicUser;
import com.rick.demoLogic.service.ILogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.constraints.NotNull;
import java.util.List;

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

    @RequestMapping("/saveUser.do")
    public String jumpToSaveJsp(){
        return "saveUser";
    }

    @RequestMapping("/querylist.do")
    public String queryList(Model model){
        Wrapper<LogicUser> wrapper = new EntityWrapper<>();
        wrapper.eq("del_flag",0);
        List<LogicUser> logicUsers = logicService.selectList(wrapper);
        model.addAttribute("userList",logicUsers);
        return "userList";
    }

    @RequestMapping("/delete.do")
    public String deleteUser(Integer id){
        logicService.updateUserById(id);
        return "success";
    }

}
