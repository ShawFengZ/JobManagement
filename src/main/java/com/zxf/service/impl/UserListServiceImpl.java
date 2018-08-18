package com.zxf.service.impl;

import com.zxf.entity.UserList;
import com.zxf.repository.UserListRepository;
import com.zxf.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zxf
 * @date 2018/8/18 22:50
 */
@Service
public class UserListServiceImpl implements UserListService {

    @Autowired
    private UserListRepository userListRepository;

    @Override
    public List<UserList> findAll() {
        return userListRepository.findAll();
    }

    @Override
    public UserList userListAdd(UserList userList) {
        return userListRepository.save(userList);
    }

    @Override
    public void userListDelete(UserList userList) {
        userListRepository.delete(userList);
    }

    @Override
    public void userListUpdate(UserList userList) {
        userListRepository.save(userList);
    }

    @Override
    public List<UserList> findByUserName(String userName) {
        userName ="%" + userName + "%";
        return userListRepository.findByUserNameLike(userName);
    }

    @Override
    public UserList findByUserId(Integer uerId) {
        return userListRepository.findByUserId(uerId);
    }
}
