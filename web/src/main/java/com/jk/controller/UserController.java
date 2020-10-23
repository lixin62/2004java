package com.jk.controller;

import com.jk.entity.DeptBean;
import com.jk.entity.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 *  @author: 李新
 *  @Date: 2020/10/22 16:25
 *  @Description:
 *  励志：一giao窝里giao giao
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("queryUserList")
    public String queryUserList(Model model){
        List<UserBean> list = userService.queryUserList();
        model.addAttribute("orderList", list);
        return "orderlist";
    }

    //新增
    @RequestMapping("saveOrder")
    public String saveOrder(UserBean userBean){
        userService.saveOrder(userBean);
        return "redirect:queryUserList";
    }
    //跳转新增
    @RequestMapping("toAdd")
    public String toAdd(Model model){
        model.addAttribute("order",new UserBean());
        return "add";
    }

    //删除
        @RequestMapping("deleteOrder")
        public String deleteOrder(Integer id){
        userService.deleteOrder(id);
        return "redirect:queryUserList";
    }

    //修改回显
    @RequestMapping("selectOrderById")
    public String selectOrderById(Integer id,Model model){
        UserBean order = userService.findUserById(id);
        model.addAttribute("user",order);
        return "add";
    }
}
