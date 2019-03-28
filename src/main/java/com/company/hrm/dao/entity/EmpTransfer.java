package com.company.hrm.dao.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "t_emp_transfer")
@Entity
public class EmpTransfer {
    @Id
    @GeneratedValue
    private Integer etno;
    @Column
    private String ettype;
    @Column
    private String etreson;
    @Column
    private String etremark;
    @Column
    private LocalDate etdate;

    public EmpTransfer() {
    }

    public EmpTransfer(String ettype, String etreson, String etremark, LocalDate etdate) {
        this.ettype = ettype;
        this.etreson = etreson;
        this.etremark = etremark;
        this.etdate = etdate;
    }

    public Integer getEtno() {
        return etno;
    }

    public void setEtno(Integer etno) {
        this.etno = etno;
    }

    public String getEttype() {
        return ettype;
    }

    public void setEttype(String ettype) {
        this.ettype = ettype;
    }

    public String getEtreson() {
        return etreson;
    }

    public void setEtreson(String etreson) {
        this.etreson = etreson;
    }

    public String getEtremark() {
        return etremark;
    }

    public void setEtremark(String etremark) {
        this.etremark = etremark;
    }

    public LocalDate getEtdate() {
        return etdate;
    }

    public void setEtdate(LocalDate etdate) {
        this.etdate = etdate;
    }

    @Override
    public String toString() {
        return "EmpTransfer{" +
                "etno=" + etno +
                ", ettype='" + ettype + '\'' +
                ", etreson='" + etreson + '\'' +
                ", etremark='" + etremark + '\'' +
                ", etdate=" + etdate +
                '}';
    }
}
