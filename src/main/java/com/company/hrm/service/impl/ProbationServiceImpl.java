package com.company.hrm.service.impl;

import com.company.hrm.dao.entity.Probation;
import com.company.hrm.dao.idao.ProbationDao;
import com.company.hrm.service.iservice.IProbationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("probationService")
public class ProbationServiceImpl implements IProbationService {

    @Autowired
    ProbationDao probationDao;

    @Override
    public void save(Probation probation) {
        probationDao.save(probation);
    }

    @Override
    public void delete(Probation probation) {
        probationDao.delete(probation);
    }

    @Override
    public void update(Probation probation) {
        save(probation);
    }

    @Override
    public Probation findById(Integer id) {
        return probationDao.findById(id).get();
    }

    @Override
    public List<Probation> findAll() {
        return probationDao.findAll();
    }
}
