package com.company.hrm.action;

import com.company.hrm.dao.idao.EmpDao;
import com.company.hrm.dao.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpAction {
    @Autowired
    EmpDao empDao;

    public List<Emp> findAll(){
        return empDao.findAll();
    }
}
