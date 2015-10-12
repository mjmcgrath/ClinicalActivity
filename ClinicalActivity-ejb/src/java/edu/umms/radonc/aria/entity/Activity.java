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
@Table(name="Activity")
public class Activity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="ActivitySer")
    private Long idSer;
    
    @Column(name="ActivityCode")
    private String activityCode;

    @Column(name="ObjectStatus")
    private String objectStatus;

    @Column(name="HstryDateTime")
    private Timestamp hstryDateTime;
    
    /**
     * @return the idSer
     */
    public Long getIdSer() {
        return idSer;
    }

    /**
     * @return the activityCode
     */
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * @return the objectStatus
     */
    public String getObjectStatus() {
        return objectStatus;
    }

    /**
     * @return the hstryDateTime
     */
    public Timestamp getHstryDateTime() {
        return hstryDateTime;
    }
}
