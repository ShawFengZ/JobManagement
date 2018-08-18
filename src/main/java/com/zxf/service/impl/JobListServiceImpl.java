package com.zxf.service.impl;

import com.zxf.entity.JobList;
import com.zxf.repository.JobListRepository;
import com.zxf.service.JobListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author zxf
 * @date 2018/8/18 21:19
 */
@Service
@Slf4j
public class JobListServiceImpl implements JobListService {

    @Autowired
    private JobListRepository repository;

    /** 查找所有 */
    @Override
    public List<JobList> findAll() {
        return repository.findAll();
    }

    /** 增 */
    @Override
    public JobList addJob(JobList jobList) {
        JobList list = repository.save(jobList);
        return list;
    }

    /** 删 */
    @Override
    public void deleteJob(JobList jobList) {
        repository.delete(jobList);
    }

    /** 改, 和增的区别在意jobList有没有带id */
    @Override
    public void updateJob(JobList jobList) {
        repository.save(jobList);
    }

    /** 查 */
    @Override
    public List<JobList> findByName(String jobName) {
        jobName = "%" + jobName + "%";
        return repository.findByJobNameLike(jobName);
    }

    @Override
    public JobList findByJobId(Integer jobId) {
        return repository.findByJobId(jobId);
    }
}
