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
@Table(name="ActivityInstance")
public class ActivityInstance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="ActivityInstanceSer")
    private Long idSer;

    @Column(name="ActivitySer")
    private Long activitySer;

    @Column(name="DepartmentSer")
    private Long departmentSer;
    
    @Column(name="ObjectStatus")
    private String objectStatus;
    
    @Column(name="Duration")
    private Integer duration;
    
    @Column(name="HstryDateTime")
    private Timestamp hstryDateTime;
    
    
    /**
     * @return the idSer
     */
    public Long getIdSer() {
        return idSer;
    }

    /**
     * @return the activitySer
     */
    public Long getActivitySer() {
        return activitySer;
    }

    /**
     * @return the departmentSer
     */
    public Long getDepartmentSer() {
        return departmentSer;
    }

    /**
     * @return the objectStatus
     */
    public String getObjectStatus() {
        return objectStatus;
    }

    /**
     * @return the duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * @return the hstryDateTime
     */
    public Timestamp getHstryDateTime() {
        return hstryDateTime;
    }
}
