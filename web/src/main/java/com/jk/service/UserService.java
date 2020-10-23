package com.jk.service;

import com.jk.entity.DeptBean;
import com.jk.entity.UserBean;
import com.jk.service.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "provide", fallback = UserServiceHystrix.class)
public interface UserService {

    @RequestMapping("queryUserList")
    List<UserBean> queryUserList();

    @RequestMapping("saveOrder")
    void saveOrder(@RequestBody UserBean userBean);

    @RequestMapping("deleteOrder")
    void deleteOrder(@RequestParam Integer id);

    @RequestMapping("findUserById")
    UserBean findUserById(@RequestParam Integer id);

}
