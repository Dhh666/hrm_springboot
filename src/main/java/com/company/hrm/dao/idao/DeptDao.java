package com.company.hrm.dao.idao;


import com.company.hrm.dao.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptDao extends JpaRepository<Dept,Integer> {
    
}
