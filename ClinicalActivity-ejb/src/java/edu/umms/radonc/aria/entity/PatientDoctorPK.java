/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author bzhang
 */
@Embeddable 
public class PatientDoctorPK implements Serializable
{
    private Long patientSer; 
    private Long resourceSer;

    /**
     * @return the patientSer
     */
    public Long getPatientSer() {
        return patientSer;
    }

    /**
     * @return the resourceSer
     */
    public Long getResourceSer() {
        return resourceSer;
    }
}

