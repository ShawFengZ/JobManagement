package com.zxf.service.impl;

import com.zxf.entity.GroupList;
import com.zxf.service.GroupListService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GroupListServiceImplTest {

    @Autowired
    private GroupListService groupListService;
    @Test
    public void findAll() {
        groupListService.findAll();
    }

    @Test
    public void addGroupList() {
        GroupList groupList = new GroupList();
        groupList.setGroupName("Python");
        groupList.setCreateTime(new Date());
        groupList.setGroupInfo("这是关于Python的后台开发");
        groupListService.addGroupList(groupList);
    }

    @Test
    public void deleteGroupList() {
        groupListService.deleteGroupList(groupListService.findByGroupListId(2));
    }

    @Test
    public void updateGroupList() {
        GroupList groupListId = groupListService.findByGroupListId(2);
        groupListId.setGroupName("Php");
        groupListService.updateGroupList(groupListId);
    }

    @Test
    public void findByGroupListId() {
        GroupList byGroupListId = groupListService.findByGroupListId(1);
        Assert.assertNotNull(byGroupListId);
    }

    @Test
    public void findByGroupName() {
        groupListService.findByGroupName("J");
    }
}