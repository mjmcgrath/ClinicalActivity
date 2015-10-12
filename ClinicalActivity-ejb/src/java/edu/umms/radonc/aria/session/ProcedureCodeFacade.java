/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

import edu.umms.radonc.aria.entity.ProcedureCode;
import javax.ejb.Stateless;

/**
 *
 * @author bzhang
 */
@Stateless(name="edu.umms.radonc.aria.session.ProcedureCodeFacade")
public class ProcedureCodeFacade extends AbstractFacade<ProcedureCode> implements ProcedureCodeFacadeLocal {
    /*
    @PersistenceContext(unitName = "ClinicalActivity-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    */
    
    public ProcedureCodeFacade() {
        super(ProcedureCode.class);
    }
    
}
