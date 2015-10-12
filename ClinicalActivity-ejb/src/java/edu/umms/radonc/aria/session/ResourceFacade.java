/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

import edu.umms.radonc.aria.entity.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author bzhang
 */
@Stateless(name="edu.umms.radonc.aria.session.ResourceFacade")
public class ResourceFacade extends AbstractFacade<Resource> implements ResourceFacadeLocal {

    public ResourceFacade() {
        super(Resource.class);
    }
    
}
