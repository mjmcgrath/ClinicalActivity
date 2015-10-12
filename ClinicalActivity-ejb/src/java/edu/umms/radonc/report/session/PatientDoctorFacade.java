/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import edu.umms.radonc.aria.entity.PatientDoctor;
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
@Stateless(name="edu.umms.radonc.report.session.PatientDoctorFacade")
@TransactionManagement(TransactionManagementType.BEAN)
public class PatientDoctorFacade extends AbstractFacade<PatientDoctor> implements PatientDoctorFacadeLocal {

    //@Resource
    //UserTransaction utx;

    public PatientDoctorFacade() {
        super(PatientDoctor.class);
    }
    
    /*
    @Override
    public void saveList(List<PatientDoctor> entityList)
    {
        //UserTransaction utx;
        if(entityList.size() > 0)
        {
            try
            {
                //getEntityManager().getEntityManagerFactory().getCache().
                //getEntityManager().getTransaction().begin();
                utx.begin();
                for(PatientDoctor entity: entityList)
                {
                    getEntityManager().merge(entity);
                    //getEntityManager().flush();
                }
                utx.commit();
            //getEntityManager().getTransaction().commit();
            }
            catch(Exception e)
            {
                System.out.println("BullError0-----PatientDoctor");
                e.printStackTrace();
                System.out.println("BullError1-----PatientDoctor");
            }
        }
    }
    */
}
