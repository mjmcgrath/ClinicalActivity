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
@Table(name="Hospital")
public class Hospital implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="HospitalSer")
    private Long idSer;
    
    @Column(name="HospitalName")
    private String hospitalName;

    @Column(name="HstryDateTime")
    private Timestamp hstryDateTime;
    
    /**
     * @return the idSer
     */
    public Long getIdSer() {
        return idSer;
    }

    /**
     * @return the hospitalName
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * @return the hstryDateTime
     */
    public Timestamp getHstryDateTime() {
        return hstryDateTime;
    }

    
}
