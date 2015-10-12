/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import edu.umms.radonc.aria.entity.Machine;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author bzhang
 */
@Stateless(name="edu.umms.radonc.report.session.MachineFacade")
@TransactionManagement(TransactionManagementType.BEAN)
public class MachineFacade extends AbstractFacade<Machine> implements MachineFacadeLocal {
    //@Resource 
    //UserTransaction utx;
    public MachineFacade() {
        super(Machine.class);
    }
    
}
