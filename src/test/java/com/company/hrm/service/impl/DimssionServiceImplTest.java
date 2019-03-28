package com.company.hrm.service.impl;

import com.company.hrm.common.SpringbootApplicationTests;
import com.company.hrm.dao.entity.Dimssion;
import com.company.hrm.service.iservice.IDimssionService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

public class DimssionServiceImplTest extends SpringbootApplicationTests {

    @Autowired
    IDimssionService dimssionService;

    @Test
    public void save() {
        Dimssion dimssion1 = new Dimssion(3,LocalDate.of(2017,8,23),"quit","y");
        Dimssion dimssion2 = new Dimssion(4,LocalDate.of(2016,4,2),"fire","n");
        Dimssion dimssion3 = new Dimssion(5,LocalDate.of(2019,3,7),"retire","n");
        dimssionService.save(dimssion1);
        dimssionService.save(dimssion2);
        dimssionService.save(dimssion3);
    }

    @Test
    public void delete() {
        Dimssion dimssion = new Dimssion();
        dimssion.setEno(1);
        dimssionService.delete(dimssion);
    }

    @Test
    public void update() {
        Dimssion dimssion = new Dimssion("quit");
        dimssion.setEno(2);
        dimssionService.update(dimssion);
    }

    @Test
    public void findById() {
        Dimssion dimssion = dimssionService.findById(2);
        System.out.println("**********"+dimssion.toString());
    }

    @Test
    public void findAll() {
        List<Dimssion> dimssions = dimssionService.findAll();
        for (Dimssion dimssion:dimssions){
            System.out.println("************"+dimssion.toString());
        }
    }
}