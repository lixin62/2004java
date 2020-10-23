package com.jk.service;


import com.jk.entity.DeptBean;
import com.jk.entity.UserBean;

import java.util.List;

/**
 *  @author: 李新
 *  @Date: 2020/10/22 19:14
 *  @Description:
 *  励志：一giao窝里giao giao
 */
public interface UserService {
    List<UserBean> queryUserList();

    void saveOrder(UserBean userBean);

    void deleteOrder(Integer id);

    UserBean findUserById(Integer id);
}
