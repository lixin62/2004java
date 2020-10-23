package com.jk.service.hystrix;


import com.jk.entity.DeptBean;
import com.jk.entity.UserBean;
import com.jk.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component      //将熔断器类注入到spring容器中
public class UserServiceHystrix implements UserService {

    @Override
    public List<UserBean> queryUserList() {
        return null;
    }

    @Override
    public void saveOrder(UserBean userBean) {

    }

    @Override
    public void deleteOrder(Integer id) {

    }

    @Override
    public UserBean findUserById(Integer id) {
        return null;
    }
}
