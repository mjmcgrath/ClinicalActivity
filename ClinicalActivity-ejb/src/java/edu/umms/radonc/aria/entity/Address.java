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
@Table(name="Address")
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="AddressSer")
    private Long idSer;
    
    @Column(name="AddressType", length=64)
    private String addressType;
    
    @Column(name="Country", length=64)
    private String country;
    
    @Column(name="StateOrProvince", length=64)
    private String stateOrProvince;

    @Column(name="Location", length=64)
    private String location;

    @Column(name="County", length=64)
    private String county;
    
    @Column(name="CityOrTownship", length=64)
    private String cityOrTownship;

    @Column(name="AddressLine1", length=64)
    private String addressLine1;

    @Column(name="AddressLine2", length=64)
    private String addressLine2;

    @Column(name="AddressLine3", length=64)
    private String addressLine3;
    
    @Column(name="PostalCode", length=16)
    private String postcalCode;

    @Column(name="OriginationDate")
    private Timestamp originationDate;

    @Column(name="TerminationDate")
    private Timestamp terminationDate;

    @Column(name="PhoneNumber1", length=64)
    private String phoneNumber1;

    @Column(name="PhoneNumber2", length=64)
    private String phoneNumber2;

    @Column(name="FaxNumber", length=64)
    private String faxNumber;
    
    @Column(name="EMailAddress", length=64)
    private String eMailAddress;
    
    @Column(name="PagerNumber", length=64)
    private String pagerNumber;

    @Column(name="Comment", length=254)
    private String comment;
    
    
    @Column(name="HstryDateTime")
    private Timestamp hstryDateTime;

    /**
     * @return the idSer
     */
    public Long getIdSer() {
        return idSer;
    }

    /**
     * @return the hstryDateTime
     */
    public Timestamp getHstryDateTime() {
        return hstryDateTime;
    }

    /**
     * @return the addressType
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @return the stateOrProvince
     */
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @return the county
     */
    public String getCounty() {
        return county;
    }

    /**
     * @return the cityOrTownship
     */
    public String getCityOrTownship() {
        return cityOrTownship;
    }

    /**
     * @return the addressLine1
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * @return the addressLine2
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * @return the addressLine3
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * @return the postcalCode
     */
    public String getPostcalCode() {
        return postcalCode;
    }

    /**
     * @return the originationDate
     */
    public Timestamp getOriginationDate() {
        return originationDate;
    }

    /**
     * @return the terminationDate
     */
    public Timestamp getTerminationDate() {
        return terminationDate;
    }

    /**
     * @return the phoneNumber1
     */
    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    /**
     * @return the phoneNumber2
     */
    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    /**
     * @return the faxNumber
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * @return the eMailAddress
     */
    public String geteMailAddress() {
        return eMailAddress;
    }

    /**
     * @return the pagerNumber
     */
    public String getPagerNumber() {
        return pagerNumber;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }
}
