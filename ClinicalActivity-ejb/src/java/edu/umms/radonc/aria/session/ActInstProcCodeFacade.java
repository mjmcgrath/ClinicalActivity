/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

import edu.umms.radonc.aria.entity.ActInstProcCode;
import javax.ejb.Stateless;

/**
 *
 * @author bzhang
 */
@Stateless(name="edu.umms.radonc.aria.session.ActInstProcCodeFacade")
public class ActInstProcCodeFacade extends AbstractFacade<ActInstProcCode> implements ActInstProcCodeFacadeLocal {
    /*
    @PersistenceContext(unitName = "ClinicalActivity-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    */
    
    public ActInstProcCodeFacade() {
        super(ActInstProcCode.class);
    }
}
