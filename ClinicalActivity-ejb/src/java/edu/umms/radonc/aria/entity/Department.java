/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author bzhang
 */
@Entity
@Table(name="Department")
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="DepartmentSer")
    private Long idSer;
    
    @Column(name="DepartmentName")
    private String departmentName;

    @Column(name="HospitalSer")
    private Long hospitalSer;

    @Column(name="HstryDateTime")
    private Timestamp hstryDateTime;
    
    /**
     * @return the idSer
     */
    public Long getIdSer() {
        return idSer;
    }

    /**
     * @return the departmentName
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * @return the hospitalSer
     */
    public Long getHospitalSer() {
        return hospitalSer;
    }

    /**
     * @return the hstryDateTime
     */
    public Timestamp getHstryDateTime() {
        return hstryDateTime;
    }
}
