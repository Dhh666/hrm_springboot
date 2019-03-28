package com.company.hrm.service.impl;

import com.company.hrm.dao.entity.Job;
import com.company.hrm.dao.idao.JobDao;
import com.company.hrm.service.iservice.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("jobService")
public class JobServiceImpl implements IJobService {

    @Autowired
    JobDao jobDao;

    @Override
    public void save(Job job) {
        jobDao.save(job);
    }

    @Override
    public void delete(Job job) {
        jobDao.delete(job);
    }

    @Override
    public void update(Job job) {
        save(job);
    }

    @Override
    public Job findById(Integer id) {
        return jobDao.findById(id).get();
    }

    @Override
    public List<Job> findAll() {
        return jobDao.findAll();
    }
}
