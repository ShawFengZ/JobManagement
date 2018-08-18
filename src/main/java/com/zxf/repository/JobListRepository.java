package com.zxf.repository;

import com.zxf.entity.JobList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zxf
 * @date 2018/8/18 19:50
 */
public interface JobListRepository extends JpaRepository<JobList, Integer> {

    List<JobList> findByJobNameLike(String jobName);

    JobList findByJobId(Integer jobId);

}
