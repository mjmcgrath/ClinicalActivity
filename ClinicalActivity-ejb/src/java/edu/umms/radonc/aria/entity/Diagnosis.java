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
@Table(name="Diagnosis")
public class Diagnosis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="DiagnosisSer")
    private Long idSer;
    
    @Column(name="PatientSer")
    private Long patientSer;
    
    @Column(name="DateStamp")
    private Timestamp dateStamp;
    
    @Column(name="DiagnosisId")
    private String diagnosisId;
    
    @Column(name="DiagnosisTableName")
    private String diagnosisTableName;
    
    @Column(name="DiagnosisCode")
    private String diagnosisCode;
    
    @Column(name="Description")
    private String description;
    
    @Column(name="HistologyTableName")
    private String histologyTableName;
    
    @Column(name="HistologyCode")
    private String histologyCode;
    
    @Column(name="HisDescription")
    private String hisDescription;
    
    @Column(name="ObjectStatus")
    private String objectStatus;
    
    @Column(name="DiagnosisType")
    private String diagnosisType;
    
    @Column(name="HstryDateTime")
    private Timestamp hstryDateTime;
}
