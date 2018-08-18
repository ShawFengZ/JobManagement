package com.zxf.service;

import com.zxf.entity.UserList;

import java.util.List;

/**
 * @author zxf
 * @date 2018/8/18 22:47
 */
public interface UserListService {

    //查找所有
    List<UserList> findAll();

    //增
    UserList userListAdd(UserList userList);

    //删
    void userListDelete(UserList userList);

    //改
    void userListUpdate(UserList userList);

    //按名模糊查询
    List<UserList> findByUserName(String userName);

    //按id精确查询
    UserList findByUserId(Integer uerId);
}
