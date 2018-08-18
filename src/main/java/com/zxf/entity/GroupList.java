package com.zxf.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author zxf
 * @date 2018/8/18 19:44
 */
@Data
@Entity
@DynamicUpdate
public class GroupList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer groupId;

    private String groupName;

    private Date createTime;

    private String groupInfo;
}
