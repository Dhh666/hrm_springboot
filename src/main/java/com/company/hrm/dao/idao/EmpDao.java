package com.company.hrm.dao.idao;

import com.company.hrm.dao.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpDao extends JpaRepository<Emp,Integer> {
}
