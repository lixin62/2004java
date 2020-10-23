package com.jk.service.impl;

import com.jk.entity.DeptBean;
import com.jk.entity.UserBean;
import com.jk.mapper.UserMapper;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 *  @author: 李新
 *  @Date: 2020/10/22 19:15
 *  @Description:
 *  励志：一giao窝里giao giao
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserBean> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public void saveOrder(UserBean userBean) {
        userMapper.saveOrder(userBean);
    }

    @Override
    public void deleteOrder(Integer id) {
        userMapper.deleteOrder(id);
    }

    @Override
    public UserBean findUserById(Integer id) {
        return userMapper.findUserById(id);
    }
}
