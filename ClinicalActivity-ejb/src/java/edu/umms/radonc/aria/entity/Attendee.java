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
@Table(name="Attendee")
public class Attendee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="AttendeeSer")
    private Long idSer;
    
    @Column(name="ActivityInstanceSer")
    private Long activityInstanceSer;
    
    @Column(name="ResourceSer")
    private Long resourceSer;
    
    @Column(name="ObjectStatus")
    private String objectStatus;
    
    @Column(name="PrimaryFlag")
    private boolean primaryFlag;
    
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
     * @return the resourceSer
     */
    public Long getResourceSer() {
        return resourceSer;
    }

    /**
     * @return the objectStatus
     */
    public String getObjectStatus() {
        return objectStatus;
    }

    /**
     * @return the primaryFlag
     */
    public boolean isPrimaryFlag() {
        return primaryFlag;
    }

    /**
     * @return the hstryDateTime
     */
    public Timestamp getHstryDateTime() {
        return hstryDateTime;
    }
}
