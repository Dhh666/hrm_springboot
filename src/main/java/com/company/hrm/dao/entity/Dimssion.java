package com.company.hrm.dao.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "t_emp_dimssion")
@Entity
public class Dimssion {
    @Id
    private Integer eno;
    @Column(unique = true,nullable = false)
    private LocalDate eddate;
    @Column(length = 20,unique = true,nullable = false)
    private String edtype;
    @Column(length = 20,unique = true,nullable = false)
    private String edtalent;

    public Dimssion() {
    }

    public Dimssion(String edtype) {
        this.edtype = edtype;
    }

    public Dimssion(LocalDate eddate, String edtype, String edtalent) {
        this.eddate = eddate;
        this.edtype = edtype;
        this.edtalent = edtalent;
    }

    public Dimssion(Integer eno, LocalDate eddate, String edtype, String edtalent) {
        this.eno = eno;
        this.eddate = eddate;
        this.edtype = edtype;
        this.edtalent = edtalent;
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public LocalDate getEddate() {
        return eddate;
    }

    public void setEddate(LocalDate eddate) {
        this.eddate = eddate;
    }

    public String getEdtype() {
        return edtype;
    }

    public void setEdtype(String edtype) {
        this.edtype = edtype;
    }

    public String getEdtalent() {
        return edtalent;
    }

    public void setEdtalent(String edtalent) {
        this.edtalent = edtalent;
    }

    @Override
    public String toString() {
        return "Dimssion{" +
                "eno=" + eno +
                ", eddate=" + eddate +
                ", edtype='" + edtype + '\'' +
                ", edtalent='" + edtalent + '\'' +
                '}';
    }
}
