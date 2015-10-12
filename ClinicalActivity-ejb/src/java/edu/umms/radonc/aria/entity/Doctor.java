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
@Table(name="Doctor")
public class Doctor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="ResourceSer")
    private Long idSer;
    
    @Column(name="LastName")
    private String lastName;
    
    @Column(name="FirstName")
    private String firstName;
    
    @Column(name="MiddleName")
    private String middleName;
    
    @Column(name="OncologistFlag")
    private boolean oncologistFlag;

    /**
     * @return the idSer
     */
    public Long getIdSer() {
        return idSer;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @return the oncologistFlag
     */
    public boolean isOncologistFlag() {
        return oncologistFlag;
    }
}
