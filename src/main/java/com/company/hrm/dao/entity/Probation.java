package com.company.hrm.dao.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "t_emp_probation")
@Entity
public class Probation {
    @Id
    @GeneratedValue
    private Integer eno;
    @Column(unique = true,nullable = false)
    private LocalDate epstartdate;
    @Column(unique = true,nullable = false)
    private LocalDate ependdate;
    @Column(length = 20,unique = true,nullable = false)
    private String epstate;

    public Probation() {
    }

    public Probation(LocalDate epstartdate, LocalDate ependdate, String epstate) {
        this.epstartdate = epstartdate;
        this.ependdate = ependdate;
        this.epstate = epstate;
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public LocalDate getEpstartdate() {
        return epstartdate;
    }

    public void setEpstartdate(LocalDate epstartdate) {
        this.epstartdate = epstartdate;
    }

    public LocalDate getEpenddate() {
        return ependdate;
    }

    public void setEpenddate(LocalDate ependdate) {
        this.ependdate = ependdate;
    }

    public String getEpstate() {
        return epstate;
    }

    public void setEpstate(String epstate) {
        this.epstate = epstate;
    }

    @Override
    public String toString() {
        return "Probation{" +
                "eno=" + eno +
                ", epstartdate=" + epstartdate +
                ", ependdate=" + ependdate +
                ", epstate='" + epstate + '\'' +
                '}';
    }
}
