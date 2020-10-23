package com.jk.mapper;


import com.jk.entity.DeptBean;
import com.jk.entity.UserBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *  @author: 李新
 *  @Date: 2020/10/22 19:16
 *  @Description:
 *  励志：一giao窝里giao giao
 */
@Mapper
public interface UserMapper {

    @Select("select * from t_user a left join t_dept b on a.deptId = b.deptId")
    List<UserBean> queryUserList();

    @Insert("insert into t_user(userName,deptId,createDate,post) values(#{userName},#{deptId},sysdate(),#{post})")
    void saveOrder(UserBean userBean);

    @Delete("delete from t_user where userId = #{value}")
    void deleteOrder(Integer id);

    @Select("select userId,userName,deptId,post from t_user  where userId = #{value}")
    UserBean findUserById(Integer id);
}
