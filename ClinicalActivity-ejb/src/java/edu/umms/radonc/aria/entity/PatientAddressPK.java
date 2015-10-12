/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author bzhang
 */
@Embeddable 
public class PatientAddressPK implements Serializable
{
    @Column(name="PatientSer")
    private Long patientSer;
    
    @Column(name="AddressSer")
    private Long addressSer;

    public PatientAddressPK() {}
    
    public PatientAddressPK(Long patientSer, Long addressSer)
    {
        this.patientSer = patientSer;
        this.addressSer = addressSer;
    }
    /**
     * @return the patientSer
     */
    public Long getPatientSer() {
        return patientSer;
    }

    /**
     * @return the resourceSer
     */
    public Long getAddressSer() {
        return addressSer;
    }
}

