/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

import edu.umms.radonc.aria.entity.Activity;
import javax.ejb.Stateless;

/**
 *
 * @author bzhang
 */
@Stateless(name="edu.umms.radonc.aria.session.ActivityFacade")
public class ActivityFacade extends AbstractFacade<Activity> implements ActivityFacadeLocal {
    /*
    @PersistenceContext(unitName = "ClinicalActivity-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    */
    public ActivityFacade() {
        super(Activity.class);
    }
    
}
