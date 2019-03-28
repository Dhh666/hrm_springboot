package com.company.hrm.service.impl;

import com.company.hrm.common.SpringbootApplicationTests;
import com.company.hrm.dao.entity.Dept;
import com.company.hrm.service.iservice.IDeptService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

public class DeptServiceImplTest extends SpringbootApplicationTests {

    @Autowired
    IDeptService deptService;

    @Test
    public void save() {
        Dept dept1 = new Dept("软件开发部","department","4233768", LocalDate.of(2009,9,23));
        Dept dept2 = new Dept("市场营销部","department","7657657", LocalDate.of(2009,3,13));
        Dept dept3 = new Dept("软件技术部","department","4534564", LocalDate.of(2010,10,31),1);
        deptService.save(dept1);
        deptService.save(dept2);
        deptService.save(dept3);
    }

    @Test
    public void delete() {
        Dept dept = new Dept();
        dept.setDno(10);
        deptService.delete(dept);
    }

    @Test
    public void update() {
        Dept dept = new Dept("硬件开发部");
        dept.setDno(9);
        deptService.update(dept);
    }

    @Test
    public void findById() {
        Dept dept = deptService.findById(9);
        System.out.println("************"+dept.toString());
    }

    @Test
    public void findAll() {
        List<Dept> depts = deptService.findAll();
        for (Dept dept:depts){
            System.out.println("**********"+dept.toString());
        }
    }
}