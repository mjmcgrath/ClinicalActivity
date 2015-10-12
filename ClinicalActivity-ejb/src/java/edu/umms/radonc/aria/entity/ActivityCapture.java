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
@Table(name="ActivityCapture")
public class ActivityCapture implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="ActivityCaptureSer")
    private Long idSer;

    @Column(name="ActivityInstanceSer")
    private Long activityInstanceSer;
    
    @Column(name="AttendingOncologistSer")
    private Long attendingOncologistSer;
    
    @Column(name="DepartmentSer")
    private Long departmentSer;
    
    @Column(name="CourseSer")
    private Long courseSer;
    
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
     * @return the attendingOncologistSer
     */
    public Long getAttendingOncologistSer() {
        return attendingOncologistSer;
    }

    /**
     * @return the departmentSer
     */
    public Long getDepartmentSer() {
        return departmentSer;
    }

    /**
     * @return the courseSer
     */
    public Long getCourseSer() {
        return courseSer;
    }

    /**
     * @return the hstryDateTime
     */
    public Timestamp getHstryDateTime() {
        return hstryDateTime;
    }
}
