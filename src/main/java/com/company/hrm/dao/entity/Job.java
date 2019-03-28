package com.company.hrm.dao.entity;

import javax.persistence.*;

@Table(name = "t_job")
@Entity
public class Job {
    @Id
    @GeneratedValue
    private Integer jno;
    @Column(length = 20,unique = true,nullable = false)
    private String jname;
    @Column(length = 20,unique = true,nullable = false)
    private String jtype;

    public Job() {
    }

    public Job(String jname, String jtype) {
        this.jname = jname;
        this.jtype = jtype;
    }

    public Integer getJno() {
        return jno;
    }

    public void setJno(Integer jno) {
        this.jno = jno;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getJtype() {
        return jtype;
    }

    public void setJtype(String jtype) {
        this.jtype = jtype;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jno=" + jno +
                ", jname='" + jname + '\'' +
                ", jtype='" + jtype + '\'' +
                '}';
    }
}
