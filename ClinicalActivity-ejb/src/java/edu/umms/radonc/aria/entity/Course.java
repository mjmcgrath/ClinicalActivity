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
@Table(name="Course")
public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="CourseSer")
    private Long idSer;
    
    @Column(name="PatientSer")
    private Long patientSer;
    
    //@Column(name="Intent")
    //private String intent;
    
    @Column(name="ClinicalStatus")
    private String clinicalStatus;
    
    @Column(name="HstryDateTime")
    private Timestamp hstryDateTime;

    /**
     * @return the idSer
     */
    public Long getIdSer() {
        return idSer;
    }

    /**
     * @return the patientSer
     */
    public Long getPatientSer() {
        return patientSer;
    }

    /**
     * @return the intent
     */
    //public String getIntent() {
    //    return intent;
    //}

    /**
     * @return the clinicalStatus
     */
    public String getClinicalStatus() {
        return clinicalStatus;
    }

    /**
     * @return the hstryDateTime
     */
    public Timestamp getHstryDateTime() {
        return hstryDateTime;
    }
}
