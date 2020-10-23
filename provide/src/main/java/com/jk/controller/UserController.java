package com.jk.controller;


import com.jk.entity.DeptBean;
import com.jk.entity.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("queryUserList")
    @ResponseBody
    public List<UserBean> queryUserList(){
        return userService.queryUserList();
    }
    @RequestMapping("saveOrder")
    @ResponseBody
    public void saveOrder(@RequestBody UserBean userBean){
        userService.saveOrder(userBean);
    }

    @RequestMapping("deleteOrder")
    @ResponseBody
    public void deleteOrder(@RequestParam Integer id){
        userService.deleteOrder(id);
    }

    @RequestMapping("findUserById")
    @ResponseBody
    public UserBean findUserById(@RequestParam Integer id){
        return userService.findUserById(id);
    }
}
