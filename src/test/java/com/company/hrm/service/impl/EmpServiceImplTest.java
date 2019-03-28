package com.company.hrm.service.impl;

import com.company.hrm.common.SpringbootApplicationTests;
import com.company.hrm.dao.entity.Emp;
import com.company.hrm.service.iservice.IEmpService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

public class EmpServiceImplTest extends SpringbootApplicationTests {

    @Autowired
    IEmpService empService;

    @Test
    public void save() {
        Emp emp = new Emp("金山","男", LocalDate.of(1992,5,15),"532723199205158779","master",9,1,LocalDate.of(2014,6,19),LocalDate.of(2014,9,19),"onjob","regular","school");
        empService.save(emp);
    }

    @Test
    public void delete() {
        Emp emp = new Emp();
        emp.setEno(1);
        empService.delete(emp);
    }

    @Test
    public void update() {
        Emp emp = new Emp("former");
        emp.setEno(2);
        empService.update(emp);
    }

    @Test
    public void findById() {
        Emp emp = empService.findById(2);
        System.out.println("***********"+emp.toString());
    }

    @Test
    public void findAll() {
        List<Emp> emps = empService.findAll();
        for (Emp emp:emps){
            System.out.println("***********"+emp.toString());
        }
    }
}