package com.company.hrm.dao.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "t_dept_transfer")
@Entity
public class DeptTransfer {
    @Id
    @GeneratedValue
    private Integer dtno;
    @Column(length = 20,unique = true,nullable = false)
    private String dttype;
    @Column(length = 20,unique = true,nullable = false)
    private String dtreson;
    @Column(length = 20,unique = true,nullable = false)
    private String dtremark;
    @Column(unique = true,nullable = false)
    private LocalDate dtdate;

    public DeptTransfer() {
    }

    public DeptTransfer(String dttype, String dtreson, String dtremark, LocalDate dtdate) {
        this.dttype = dttype;
        this.dtreson = dtreson;
        this.dtremark = dtremark;
        this.dtdate = dtdate;
    }

    public String getDtremark() {
        return dtremark;
    }

    public void setDtremark(String dtremark) {
        this.dtremark = dtremark;
    }

    public Integer getDtno() {
        return dtno;
    }

    public void setDtno(Integer dtno) {
        this.dtno = dtno;
    }

    public String getDttype() {
        return dttype;
    }

    public void setDttype(String dttype) {
        this.dttype = dttype;
    }

    public String getDtreson() {
        return dtreson;
    }

    public void setDtreson(String dtreson) {
        this.dtreson = dtreson;
    }

    public LocalDate getDtdate() {
        return dtdate;
    }

    public void setDtdate(LocalDate dtdate) {
        this.dtdate = dtdate;
    }

    @Override
    public String toString() {
        return "DeptTransfer{" +
                "dtno=" + dtno +
                ", dttype='" + dttype + '\'' +
                ", dtreson='" + dtreson + '\'' +
                ", dtremark='" + dtremark + '\'' +
                ", dtdate=" + dtdate +
                '}';
    }
}
