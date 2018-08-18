package com.zxf.service.impl;

import com.zxf.entity.JobList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GroupListServiceTest {

    @Autowired
    private JobListServiceImpl jobListServiceImpl;

    @Test
    public void findAll() {
        List<JobList> jobListAll = jobListServiceImpl.findAll();
        Assert.assertNotEquals(0, jobListAll.size());
    }

    @Test
    public void addJob() {
        JobList jobList = new JobList();
        jobList.setJobName("微信前台开发");
        jobList.setJobGroup("Java");
        jobList.setCreateTime(new Date());
        jobList.setStartTime(new Date());
        jobList.setEndTimeActu(new Date());
        jobList.setEndTimePlan(new Date());
        jobList.setUserId(1);
        jobList.setDescription("This is a test data2");
        jobListServiceImpl.addJob(jobList);
    }

    @Test
    public void deleteJob() {
        jobListServiceImpl.deleteJob(jobListServiceImpl.findByJobId(3));
    }

    @Test
    public void updateJob() {
        JobList job = jobListServiceImpl.findByJobId(2);
        job.setJobName("Q开发");
        jobListServiceImpl.updateJob(job);
    }

    @Test
    public void findByName() {
        jobListServiceImpl.findByName("微信后台开发");
    }

    @Test
    public void findByJobId(){
        Integer jobId = 1;
        JobList jobList = jobListServiceImpl.findByJobId(1);
        System.out.println(jobList.toString()+"==================");
    }
}