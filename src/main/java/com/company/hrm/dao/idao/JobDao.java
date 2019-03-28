package com.company.hrm.dao.idao;

import com.company.hrm.dao.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDao extends JpaRepository<Job,Integer> {
}
