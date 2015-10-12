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
@Table(name="Machine")
public class Machine implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="ResourceSer")
    private Long idSer;
    
    @Column(name="MachineId")
    private String machineId;
    
    @Column(name="MachineName")
    private String machineName;
    
    @Column(name="MachineType")
    private String machineType;
    
    @Column(name="MachineModel")
    private String machineModel;
    
    @Column(name="OperationStatus")
    private String operationStatus;

    /**
     * @return the idSer
     */
    public Long getIdSer() {
        return idSer;
    }

    /**
     * @return the machineId
     */
    public String getMachineId() {
        return machineId;
    }

    /**
     * @return the machineName
     */
    public String getMachineName() {
        return machineName;
    }

    /**
     * @return the machineType
     */
    public String getMachineType() {
        return machineType;
    }

    /**
     * @return the machineModel
     */
    public String getMachineModel() {
        return machineModel;
    }

    /**
     * @return the operationStatus
     */
    public String getOperationStatus() {
        return operationStatus;
    }

}
