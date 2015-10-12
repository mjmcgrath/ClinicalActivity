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
@Table(name="ScheduledActivity")
public class ScheduledActivity implements Serializable {
    @Id
    @Column(name="ScheduledActivitySer")
    private Long idSer;

    @Column(name="ActivityInstanceSer")
    private Long activityInstanceSer;

    @Column(name="PatientSer")
    private Long patientSer;
    
    @Column(name="CreationDate")
    private Timestamp creationDate;
    
    @Column(name="ScheduledStartTime")
    private Timestamp scheduledStartTime;

    @Column(name="ScheduledEndTime")
    private Timestamp scheduledEndTime;
    
    @Column(name="ActualStartDate")
    private Timestamp actualStartDate;
    
    @Column(name="ActualEndDate")
    private Timestamp actualEndDate;
    
    @Column(name="ObjectStatus", length=16)
    private String objectStatus;
    
    @Column(name="Priority", length=64)
    private String priority;
    
    @Column(name="ActivityNote", length=254)
    private String activityNote;

    @Column(name="HstryDateTime")
    private Timestamp hstryDateTime;
    
    /**
     * @return the idSer
     */
    public Long getIdSer() {
        return idSer;
    }

    /**
     * @return the activityInstanceSer
     */
    public Long getActivityInstanceSer() {
        return activityInstanceSer;
    }

    /**
     * @return the patientSer
     */
    public Long getPatientSer() {
        return patientSer;
    }

    /**
     * @return the creationDate
     */
    public Timestamp getCreationDate() {
        return creationDate;
    }

    /**
     * @return the scheduledStartTime
     */
    public Timestamp getScheduledStartTime() {
        return scheduledStartTime;
    }

    /**
     * @return the scheduledEndTime
     */
    public Timestamp getScheduledEndTime() {
        return scheduledEndTime;
    }

    /**
     * @return the actualStartDate
     */
    public Timestamp getActualStartDate() {
        return actualStartDate;
    }

    /**
     * @return the actualEndDate
     */
    public Timestamp getActualEndDate() {
        return actualEndDate;
    }

    /**
     * @return the HstryDateTime
     */
    public Timestamp getHstryDateTime() {
        return hstryDateTime;
    }

    /**
     * @return the objectStatus
     */
    public String getObjectStatus() {
        return objectStatus;
    }

    /**
     * @return the priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * @return the activityNote
     */
    public String getActivityNote() {
        return activityNote;
    }
    
    
}
