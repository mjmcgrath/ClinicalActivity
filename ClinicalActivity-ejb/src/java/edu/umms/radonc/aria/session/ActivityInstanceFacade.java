/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

import edu.umms.radonc.aria.entity.ActivityInstance;
import javax.ejb.Stateless;

/**
 *
 * @author bzhang
 */
@Stateless(name="edu.umms.radonc.aria.session.ActivityInstanceFacade")
public class ActivityInstanceFacade extends AbstractFacade<ActivityInstance> implements ActivityInstanceFacadeLocal {
    public ActivityInstanceFacade() {
        super(ActivityInstance.class);
    }
    
}
