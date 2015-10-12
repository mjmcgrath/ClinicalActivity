/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author bzhang
 */

@Entity
@Table(name="PatientDoctor")
public class PatientDoctor implements Serializable {
    private static final long serialVersionUID = 1L;
    @AttributeOverrides
    ({
        @AttributeOverride(name="patientSer", column=@Column(name="PatientSer")),
        @AttributeOverride(name="resourceSer", column=@Column(name="ResourceSer"))
    })
    @EmbeddedId
    private PatientDoctorPK patientDoctorPK;

    
    @Column(name="OncologistFlag")
    private Boolean oncologistFlag;
    
    @Column(name="PrimaryFlag")
    private Boolean primaryFlag;
    
    @Column(name="HstryDateTime")
    private Timestamp hstryDateTime;

    /**
     * @return the patientDoctorPK
     */
    public PatientDoctorPK getPatientDoctorPK() {
        return patientDoctorPK;
    }

    /**
     * @return the oncologistFlag
     */
    public Boolean getOncologistFlag() {
        return oncologistFlag;
    }

    /**
     * @return the primaryFlag
     */
    public Boolean getPrimaryFlag() {
        return primaryFlag;
    }

    /**
     * @return the hstryDateTime
     */
    public Timestamp getHstryDateTime() {
        return hstryDateTime;
    }
}