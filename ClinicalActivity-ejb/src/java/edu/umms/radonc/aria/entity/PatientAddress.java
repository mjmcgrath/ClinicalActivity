/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author bzhang
 */
/*
@Embeddable
class PatientAddressPK implements Serializable
{
    @Column(name="PatientSer")
    private Integer patientSer;
    
    @Column(name="AddressSer")
    private Integer addressSer;
    
    public PatientAddressPK() {}
    
    public PatientAddressPK(Integer patientSer, Integer addressSer)
    {
        this.patientSer = patientSer;
        this.addressSer = addressSer;
    }

    public Integer getPatientSer() {
        return patientSer;
    }

    public void setPatientSer(Integer patientSer) {
        this.patientSer = patientSer;
    }

    public Integer getAddressSer() {
        return addressSer;
    }

    public void setAddressSer(Integer addressSer) {
        this.addressSer = addressSer;
    }
    
}
*/

@Entity
@Table(name="PatientAddress")
public class PatientAddress implements Serializable {

    @EmbeddedId
    private PatientAddressPK patientAddressPK;

    @Column(name="PrimaryFlag")
    private Integer primaryFlag;
    
    @Column(name="HstryDateTime")
    private Timestamp hstryDateTime;

    /**
     * @return the pk
     */
    public PatientAddressPK getPatientAddressPK() {
        return patientAddressPK;
    }

    /**
     * @return the primaryFlag
     */
    public Integer getPrimaryFlag() {
        return primaryFlag;
    }

    /**
     * @return the hstryTimeStamp
     */
    public Timestamp getHstryDateTime() {
        return hstryDateTime;
    }

}
