package com.zxf.repository;

import com.zxf.entity.GroupList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zxf
 * @date 2018/8/18 22:19
 */
public interface GroupListRepository extends JpaRepository<GroupList, Integer> {
    /** 按名查找的模糊查询 */
    List<GroupList> findByGroupNameLike(String groupName);

    GroupList findByGroupId(Integer groupId);
}
