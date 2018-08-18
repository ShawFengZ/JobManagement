package com.zxf.service.impl;

import com.zxf.entity.UserList;
import com.zxf.service.UserListService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserListServiceImplTest {

    @Autowired
    private UserListService userListService;

    @Test
    public void findAll() {
        List<UserList> userLists = userListService.findAll();
    }

    @Test
    public void userListAdd() {
        UserList userList = new UserList();
        userList.setUserName("赵大峰");
        userList.setGender(1);
        userList.setAge(24);
        userList.setCompany("Google");
        userList.setPhone("15310614291");
        userList.setJobNum(1);
        userList.setCreateTime(new Date());
        userListService.userListAdd(userList);
    }

    @Test
    public void userListDelete() {
        UserList userList = userListService.findByUserId(2);
        userListService.userListDelete(userList);
    }

    @Test
    public void userListUpdate() {
        UserList userList = userListService.findByUserId(2);
        userList.setUserName("李晓峰");
        userListService.userListUpdate(userList);
    }

    @Test
    public void findByUserName() {
        List<UserList> userLists = userListService.findByUserName("赵");
        Assert.assertEquals(2, userLists.size());
    }

    @Test
    public void findByUserId() {
        userListService.findByUserId(2);
    }
}