/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import edu.umms.radonc.aria.entity.ActivityCapture;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author bzhang
 */
@Stateless(name="edu.umms.radonc.report.session.ActivityCaptureFacade")
@TransactionManagement(TransactionManagementType.BEAN)
public class ActivityCaptureFacade extends AbstractFacade<ActivityCapture> implements ActivityCaptureFacadeLocal {

    //@Resource 
    //UserTransaction utx;
    
    public ActivityCaptureFacade() {
        super(ActivityCapture.class);
    }
    
    /*
    @Override
    public void saveList(List<ActivityCapture> entityList)
    {
        //UserTransaction utx;
        if(entityList != null && entityList.size() > 0)
        {
            try
            {
            
                //getEntityManager().getEntityManagerFactory().getCache().
                //getEntityManager().getTransaction().begin();
                utx.begin();
                for(ActivityCapture entity: entityList)
                {
                    getEntityManager().persist(entity);
                    //getEntityManager().flush();
                }
                utx.commit();
            //getEntityManager().getTransaction().commit();
            }
            catch(Exception e)
            {
                System.out.println("BullError0-----ActivityCapture");
                System.out.println("BullError1-----ActivityCapture");
            }
        }
    }
    */
}
