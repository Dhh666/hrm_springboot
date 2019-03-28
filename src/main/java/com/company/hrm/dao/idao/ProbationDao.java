package com.company.hrm.dao.idao;

import com.company.hrm.dao.entity.Probation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProbationDao extends JpaRepository<Probation,Integer> {
}
