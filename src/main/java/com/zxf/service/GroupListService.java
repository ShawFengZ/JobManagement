package com.zxf.service;

import com.zxf.entity.GroupList;

import java.util.List;

/**
 * @author zxf
 * @date 2018/8/18 22:16
 */
public interface GroupListService {

    //查询所有
    List<GroupList> findAll();

    //增
    GroupList addGroupList(GroupList groupList);

    //删
    void deleteGroupList(GroupList groupList);

    //改
    void updateGroupList(GroupList groupList);

    //根据id查
    GroupList findByGroupListId(Integer groupListId);

    //根据name查，应该写模糊查询
    List<GroupList> findByGroupName(String groupName);

}
