package com.company.hrm.dao.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Table(name = "t_emp")
@Entity
public class Emp {
    @Id
    @GeneratedValue
    private Integer eno;
    @Column(length = 20,unique = true,nullable = false)
    private String ename;
    @Column(length = 20,unique = true,nullable = false)
    private String ssex;
    @Column(unique = true,nullable = false)
    private LocalDate ebirthday;
    @Column(length = 20,unique = true,nullable = false)
    private String eid;
    @Column(length = 20,unique = true,nullable = false)
    private String eedu;
    @Column(unique = true,nullable = false)
    private Integer dno;
    private Integer jno;
    private LocalDate hireday;
    @Column(unique = true,nullable = false)
    private LocalDate jobstartday;
    @Column(length = 20,unique = true,nullable = false)
    private String estate;
    @Column(length = 20,unique = true,nullable = false)
    private String etype;
    @Column(length = 20,unique = true,nullable = false)
    private String efrom;

    public Emp() {
    }

    public Emp(String estate) {
        this.estate = estate;
    }

    public Emp(String ename, String ssex, LocalDate ebirthday, String eid, String eedu, Integer dno, Integer jno, LocalDate hireday, LocalDate jobstartday, String estate, String etype, String efrom) {
        this.ename = ename;
        this.ssex = ssex;
        this.ebirthday = ebirthday;
        this.eid = eid;
        this.eedu = eedu;
        this.dno = dno;
        this.jno = jno;
        this.hireday = hireday;
        this.jobstartday = jobstartday;
        this.estate = estate;
        this.etype = etype;
        this.efrom = efrom;
    }

    public Emp(String ename, String ssex, LocalDate ebirthday, String eid, String eedu, LocalDate hireday, LocalDate jobstartday, String estate, String etype, String efrom) {
        this.ename = ename;
        this.ssex = ssex;
        this.ebirthday = ebirthday;
        this.eid = eid;
        this.eedu = eedu;
        this.hireday = hireday;
        this.jobstartday = jobstartday;
        this.estate = estate;
        this.etype = etype;
        this.efrom = efrom;
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    public Integer getJno() {
        return jno;
    }

    public void setJno(Integer jno) {
        this.jno = jno;
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public LocalDate getEbirthday() {
        return ebirthday;
    }

    public void setEbirthday(LocalDate ebirthday) {
        this.ebirthday = ebirthday;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEedu() {
        return eedu;
    }

    public void setEedu(String eedu) {
        this.eedu = eedu;
    }

    public LocalDate getHireday() {
        return hireday;
    }

    public void setHireday(LocalDate hireday) {
        this.hireday = hireday;
    }

    public LocalDate getJobstartday() {
        return jobstartday;
    }

    public void setJobstartday(LocalDate jobstartday) {
        this.jobstartday = jobstartday;
    }

    public String getEstate() {
        return estate;
    }

    public void setEstate(String estate) {
        this.estate = estate;
    }

    public String getEtype() {
        return etype;
    }

    public void setEtype(String etype) {
        this.etype = etype;
    }

    public String getEfrom() {
        return efrom;
    }

    public void setEfrom(String efrom) {
        this.efrom = efrom;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                ", ssex='" + ssex + '\'' +
                ", ebirthday=" + ebirthday +
                ", eid='" + eid + '\'' +
                ", eedu='" + eedu + '\'' +
                ", dno=" + dno +
                ", jno=" + jno +
                ", hireday=" + hireday +
                ", jobstartday=" + jobstartday +
                ", estate='" + estate + '\'' +
                ", etype='" + etype + '\'' +
                ", efrom='" + efrom + '\'' +
                '}';
    }
}
