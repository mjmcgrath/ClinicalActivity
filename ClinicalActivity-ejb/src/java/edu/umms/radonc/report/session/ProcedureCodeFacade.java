/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import edu.umms.radonc.aria.entity.ProcedureCode;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author bzhang
 */
@Stateless(name="edu.umms.radonc.report.session.ProcedureCodeFacade")
@TransactionManagement(TransactionManagementType.BEAN)
public class ProcedureCodeFacade extends AbstractFacade<ProcedureCode> implements ProcedureCodeFacadeLocal {
    //@Resource 
    //UserTransaction utx;
    public ProcedureCodeFacade() {
        super(ProcedureCode.class);
    }
    
}
