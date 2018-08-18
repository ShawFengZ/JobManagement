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
 * @date 2018/8/18 19:31
 */
@Entity
@Data
@DynamicUpdate
public class JobList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer jobId;

    private String jobName;

    private String jobGroup;

    private Date createTime;

    private Date startTime;

    private Date endTimePlan;

    private Date endTimeActu;

    private Integer userId;

    private String description;

}
