package com.zxf.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author zxf
 * @date 2018/8/18 19:45
 */
@Data
@Entity
@DynamicUpdate
public class UserList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String userName;

    private Integer gender;

    private Integer age;

    private String company;

    private String phone;

    private Integer jobNum;

    private Date createTime;
}
