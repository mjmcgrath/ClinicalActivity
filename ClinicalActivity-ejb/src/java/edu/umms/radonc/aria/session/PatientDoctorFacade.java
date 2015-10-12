/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

import edu.umms.radonc.aria.entity.PatientDoctor;
import java.sql.Timestamp;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author bzhang
 */
@Stateless(name="edu.umms.radonc.aria.session.PatientDoctorFacade")
public class PatientDoctorFacade extends AbstractFacade<PatientDoctor> implements PatientDoctorFacadeLocal {

    public PatientDoctorFacade() {
        super(PatientDoctor.class);
    }
/*
    @Override
    public List<PatientDoctor> getListSince(Timestamp hstryDateTime, int maxResult)
    {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();

        CriteriaBuilder cb=getEntityManager().getCriteriaBuilder();
        
        Root<PatientDoctor> t = cq.from(PatientDoctor.class);
        Expression<Timestamp> hstryDateTimeName = t.get("hstryDateTime");

        Predicate predicate = cb.greaterThan(hstryDateTimeName, hstryDateTime);
        cq.orderBy(cb.asc(hstryDateTimeName));
        cq.where(predicate);
        cq.select(t);
        if(maxResult <= 0) 
            return getEntityManager().createQuery(cq).getResultList();
        return getEntityManager().createQuery(cq).setMaxResults(maxResult).getResultList();
    }
*/    
}
