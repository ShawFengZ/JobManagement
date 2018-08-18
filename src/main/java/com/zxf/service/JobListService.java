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
    JobList addJob(JobList jobList);

    /** 删 */
    void deleteJob(JobList jobList);

    /** 改 */
    void updateJob(JobList jobList);

    /** 查 */
    List<JobList> findByName(String jobName);

    /** 根据id查询 */
    JobList findByJobId(Integer jobId);
}
