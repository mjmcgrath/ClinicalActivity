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
@Table(name="Resource")
public class Resource implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="ResourceSer")
    private Long idSer;

    @Column(name="ResourceTypeNum")
    private Integer resourceTypeNum;
    
    @Column(name="ObjectStatus")
    private String objectStatus;
    
    @Column(name="ResourceType")
    private String resourceType;
    
    @Column(name="SchedulableFlag")
    private boolean schedulableFlag;
    
    @Column(name="HstryDateTime")
    private Timestamp hstryDateTime;

    /**
     * @return the idSer
     */
    public Long getIdSer() {
        return idSer;
    }

    /**
     * @return the resourceTypeNum
     */
    public Integer getResourceTypeNum() {
        return resourceTypeNum;
    }

    /**
     * @return the objectStatus
     */
    public String getObjectStatus() {
        return objectStatus;
    }

    /**
     * @return the resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * @return the schedulableType
     */
    public boolean isSchedulableFlag() {
        return schedulableFlag;
    }

    /**
     * @return the hstryDateTime
     */
    public Timestamp getHstryDateTime() {
        return hstryDateTime;
    }
}
