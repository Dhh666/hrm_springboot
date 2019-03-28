package com.company.hrm.dao.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Table(name = "t_dept")
@Entity
public class Dept {
    @Id
    @GeneratedValue
    private Integer dno;
    @Column(length = 20,unique = true,nullable = false)
    private String dname;
    @Column(length = 20,unique = true,nullable = false)
    private String dtype;
    @Column(length = 20,unique = true,nullable = false)
    private String dphone;
    @Column(unique = true,nullable = false)
    private LocalDate dfounddate;
    @Column(length = 11,unique = true,nullable = true)
    private Integer superdno;

    public Dept() {
    }

    public Dept(String dname, String dtype, String dphone, LocalDate dfounddate) {
        this.dname = dname;
        this.dtype = dtype;
        this.dphone = dphone;
        this.dfounddate = dfounddate;
    }

    public Dept(String dname, String dtype, String dphone, LocalDate dfounddate, Integer superdno) {
        this.dname = dname;
        this.dtype = dtype;
        this.dphone = dphone;
        this.dfounddate = dfounddate;
        this.superdno = superdno;
    }

    public Dept(String dname) {
        this.dname = dname;
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public String getDphone() {
        return dphone;
    }

    public void setDphone(String dphone) {
        this.dphone = dphone;
    }

    public LocalDate getDfounddate() {
        return dfounddate;
    }

    public void setDfounddate(LocalDate dfounddate) {
        this.dfounddate = dfounddate;
    }

    public Integer getSuperdno() {
        return superdno;
    }

    public void setSuperdno(Integer superdno) {
        this.superdno = superdno;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dno=" + dno +
                ", dname='" + dname + '\'' +
                ", dtype='" + dtype + '\'' +
                ", dphone='" + dphone + '\'' +
                ", dfounddate=" + dfounddate +
                ", superdno=" + superdno +
                '}';
    }
}
