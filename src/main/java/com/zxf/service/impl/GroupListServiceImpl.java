package com.zxf.service.impl;

import com.zxf.entity.GroupList;
import com.zxf.repository.GroupListRepository;
import com.zxf.service.GroupListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zxf
 * @date 2018/8/18 22:23
 */
@Service
public class GroupListServiceImpl implements GroupListService {

    @Autowired
    private GroupListRepository repository;
    @Override
    public List<GroupList> findAll() {
        List<GroupList> groupListList = repository.findAll();
        return groupListList;
    }

    @Override
    public GroupList addGroupList(GroupList groupList) {
        return repository.save(groupList);
    }

    @Override
    public void deleteGroupList(GroupList groupList) {
        repository.delete(groupList);
    }

    @Override
    public void updateGroupList(GroupList groupList) {
        repository.save(groupList);
    }

    @Override
    public GroupList findByGroupListId(Integer groupListId) {
        GroupList groupList = repository.findByGroupId(groupListId);
        return groupList;
    }

    @Override
    public List<GroupList> findByGroupName(String groupName) {
        groupName = "%" + groupName + "%";
        List<GroupList> groupLists = repository.findByGroupNameLike(groupName);
        return groupLists;
    }
}
