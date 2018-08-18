package com.zxf.service;

import com.zxf.entity.JobList;

import java.util.List;

/**
 * @author zxf
 * @date 2018/8/18 19:54
 */
public interface JobListService {

    /** 查询所有 */
    List<JobList> findAll();

    /** 增 */
    void addJob();

    /** 删 */
    void deleteJob();

    /** 改 */
    void updateJob();

    /** 查 */
    JobList findById();
}
