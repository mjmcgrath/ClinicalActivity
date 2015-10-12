/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import edu.umms.radonc.aria.entity.ActInstProcCode;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author bzhang
 */
@Stateless(name="edu.umms.radonc.report.session.ActInstProcCodeFacade")
@TransactionManagement(TransactionManagementType.BEAN)
public class ActInstProcCodeFacade extends AbstractFacade<ActInstProcCode> implements ActInstProcCodeFacadeLocal {

    //@Resource
    //UserTransaction utx;
    public ActInstProcCodeFacade() {
        super(ActInstProcCode.class);
    }
    
    /*
    @Override
    public void saveList(List<ActInstProcCode> entityList)
    {
        //UserTransaction utx;
        if(entityList.size() > 0)
        {
            try
            {
                //getEntityManager().getEntityManagerFactory().getCache().
                //getEntityManager().getTransaction().begin();
                utx.begin();
                for(ActInstProcCode entity: entityList)
                {
                    getEntityManager().persist(entity);
                    //getEntityManager().flush();
                }
                utx.commit();
            //getEntityManager().getTransaction().commit();
            }
            catch(Exception e)
            {
                System.out.println("BullError0-----ActInstProcCode");
                e.printStackTrace();
                System.out.println("BullError1-----ActInstProcCode");
            }
        }
    }
    */
}
