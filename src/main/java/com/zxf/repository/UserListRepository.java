package com.zxf.repository;

import com.zxf.entity.UserList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zxf
 * @date 2018/8/18 22:44
 */
public interface UserListRepository extends JpaRepository<UserList, Integer> {

    //通过姓名模糊查询
    List<UserList> findByUserNameLike(String userName);

    //通过id精确查询
    UserList findByUserId(Integer userId);
}
