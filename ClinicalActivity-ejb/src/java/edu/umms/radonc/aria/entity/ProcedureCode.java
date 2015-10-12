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
ProcedureCodeSer    Integer
ActivityCategorySer Integer
ProcedureCode       VARCHAR
CodeType            VARCHAR
ShortComment        VARCHAR

*/
@Entity
@Table(name="ProcedureCode")
public class ProcedureCode implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ProcedureCodeSer")
    private Long idSer;

    @Column(name="ProcedureCode")
    private String procedureCode;

    @Column(name="CodeType")
    private String codeType;

    @Column(name="ShortComment")
    private String shortComment;

    @Column(name="Comment")
    private String comment;  
    
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
     * @return the procedureCode
     */
    public String getProcedureCode() {
        return procedureCode;
    }

    /**
     * @return the codeType
     */
    public String getCodeType() {
        return codeType;
    }

    /**
     * @return the shortComment
     */
    public String getShortComment() {
        return shortComment;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @return the departmentSer
     */
    public Long getDepartmentSer() {
        return departmentSer;
    }

    /**
     * @return the hstryDateTime
     */
    public Timestamp getHstryDateTime() {
        return hstryDateTime;
    }
}
