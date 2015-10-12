/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import edu.umms.radonc.aria.entity.ActivityInstance;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author bzhang
 */
@Stateless(name="edu.umms.radonc.report.session.ActivityInstanceFacade")
@TransactionManagement(TransactionManagementType.BEAN)
public class ActivityInstanceFacade extends AbstractFacade<ActivityInstance> implements ActivityInstanceFacadeLocal {

    //@Resource
    //UserTransaction utx;
    public ActivityInstanceFacade() {
        super(ActivityInstance.class);
    }
    
    /*
    @Override
    public void saveList(List<ActivityInstance> entityList)
    {
        //UserTransaction utx;
        if(entityList.size() > 0)
        {
            try
            {
            
                //getEntityManager().getEntityManagerFactory().getCache().
                //getEntityManager().getTransaction().begin();
                utx.begin();
                for(ActivityInstance entity: entityList)
                {
                    getEntityManager().persist(entity);
                    //getEntityManager().flush();
                }
                utx.commit();
            //getEntityManager().getTransaction().commit();
            }
            catch(Exception e)
            {
                System.out.println("BullError0-----ActivityInstance");
                e.printStackTrace();
                System.out.println("BullError1-----ActivityInstance");
            }
        }
    }
    */
}
