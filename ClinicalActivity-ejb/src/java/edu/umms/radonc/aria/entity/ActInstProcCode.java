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
/*
ActInstProcCodeSer Integer
ProcedureCodeSer   Integer
ToDateOfService    Date
FromDateOfService  Date
CompletedDateTime  Date
DepartmentSer      Integer

*/
@Entity
@Table(name="ActInstProcCode")
public class ActInstProcCode implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * @return the serialVersionUID
     */
    @Id
    @Column(name="ActInstProcCodeSer")
    private Long idSer;

    @Column(name="ProcedureCodeSer")
    private Long procedureCodeSer;
    
    @Column(name="ActivityInstanceSer")
    private Long activityInstanceSer;
    
    @Column(name="ToDateOfService")
    private Timestamp toDateOfService;
    
    @Column(name="FromDateOfService")
    private Timestamp fromDateOfService;

    @Column(name="CompletedDateTime")
    private Timestamp completedDateTime;

    @Column(name="DepartmentSer")
    private Long departmentSer;

    @Column(name="HstryDateTime")
    private Timestamp hstryDateTime;
    
    /**
     * @return the idSer
     */
    public Long getIdSer() {
        return idSer;
    }

    /**
     * @return the procedureCodeSer
     */
    public Long getProcedureCodeSer() {
        return procedureCodeSer;
    }

    /**
     * @return the toDateOfService
     */
    public Timestamp getToDateOfService() {
        return toDateOfService;
    }

    /**
     * @return the fromDateOfService
     */
    public Timestamp getFromDateOfService() {
        return fromDateOfService;
    }

    /**
     * @return the completedDateTime
     */
    public Timestamp getCompletedDateTime() {
        return completedDateTime;
    }

    /**
     * @return the departmentSer
     */
    public Long getDepartmentSer() {
        return departmentSer;
    }

    /**
     * @return the activityInstanceSer
     */
    public Long getActivityInstanceSer() {
        return activityInstanceSer;
    }

    /**
     * @return the hstryDateTime
     */
    public Timestamp getHstryDateTime() {
        return hstryDateTime;
    }
}
