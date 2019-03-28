package com.company.hrm.service.impl;

import com.company.hrm.dao.entity.Dept;
import com.company.hrm.dao.idao.DeptDao;
import com.company.hrm.service.iservice.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deptService")
public class DeptServiceImpl implements IDeptService {

    @Autowired
    DeptDao deptDao;

    @Override
    public void save(Dept dept) {
        deptDao.save(dept);
    }

    @Override
    public void delete(Dept dept) {
        deptDao.delete(dept);
    }

    @Override
    public void update(Dept dept) {
        save(dept);
    }

    @Override
    public Dept findById(Integer id) {
        return deptDao.findById(id).get();
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
