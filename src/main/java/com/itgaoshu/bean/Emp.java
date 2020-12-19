package com.itgaoshu.bean;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 1.实体类与要实现序列化接口
 * 2.属性类型改为其包装类型
 * 3.在类上使用@Table注解需要制定此实体类对应的表
 * 4.在唯一约束(主键)上使用@Id注解指定表中关联的主键
 * 5.如果表中字段字段名和属性名不一致需要使用@Colunm注解关联字段名
 */
@Table(name="Emp")
public class Emp implements Serializable{
    @Id
    private Integer empid;
    private String empname;
    private Double salary;
    private String hiredate;

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
}
