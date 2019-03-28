package com.company.hrm.service.impl;

import com.company.hrm.dao.entity.Dimssion;
import com.company.hrm.dao.idao.DimssionDao;
import com.company.hrm.service.iservice.IDimssionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dimssionService")
public class DimssionServiceImpl implements IDimssionService {

    @Autowired
    DimssionDao dimssionDao;

    @Override
    public void save(Dimssion dimssion) {
        dimssionDao.save(dimssion);
    }

    @Override
    public void delete(Dimssion dimssion) {
        dimssionDao.delete(dimssion);
    }

    @Override
    public void update(Dimssion dimssion) {
        save(dimssion);
    }

    @Override
    public Dimssion findById(Integer id) {
        return dimssionDao.findById(id).get() ;
    }

    @Override
    public List<Dimssion> findAll() {
        return dimssionDao.findAll();
    }
}
