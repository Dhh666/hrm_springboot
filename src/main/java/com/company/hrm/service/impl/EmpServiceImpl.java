package com.company.hrm.service.impl;

import com.company.hrm.dao.entity.Emp;
import com.company.hrm.dao.idao.EmpDao;
import com.company.hrm.service.iservice.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("empService")
public class EmpServiceImpl implements IEmpService {

    @Autowired
    EmpDao empDao;

    @Override
    public void save(Emp emp) {
        empDao.save(emp);
    }

    @Override
    public void delete(Emp emp) {
        empDao.delete(emp);
    }

    @Override
    public void update(Emp emp) {
        save(emp);
    }

    @Override
    public Emp findById(Integer id) {
        return empDao.findById(id).get();
    }

    @Override
    public List<Emp> findAll() {
        return empDao.findAll();
    }
}
