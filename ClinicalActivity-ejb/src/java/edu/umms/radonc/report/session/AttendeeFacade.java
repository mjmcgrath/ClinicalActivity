/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import edu.umms.radonc.aria.entity.Attendee;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.transaction.UserTransaction;

/**
 *
 * @author bzhang
 */
@Stateless(name="edu.umms.radonc.report.session.AttendeeFacade")
@TransactionManagement(TransactionManagementType.BEAN)
public class AttendeeFacade extends AbstractFacade<Attendee> implements AttendeeFacadeLocal {

    //@Resource
    //UserTransaction utx;
    
    public AttendeeFacade() {
        super(Attendee.class);
    }
    /*
    @Override
    public void saveList(List<Attendee> entityList)
    {
        //UserTransaction utx;
        if(entityList.size() > 0)
        {
            try
            {
            
                //getEntityManager().getEntityManagerFactory().getCache().
                //getEntityManager().getTransaction().begin();
                utx.begin();
                for(Attendee entity: entityList)
                {
                    getEntityManager().persist(entity);
                    //getEntityManager().flush();
                }
                utx.commit();
            //getEntityManager().getTransaction().commit();
            }
            catch(Exception e)
            {
                System.out.println("BullError0-----Attendee");
                e.printStackTrace();
                System.out.println("BullError1-----Attendee");
            }
        }
    }
    */
}
