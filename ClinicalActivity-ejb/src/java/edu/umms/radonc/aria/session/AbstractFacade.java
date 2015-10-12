/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

import edu.umms.radonc.common.Parameters;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author bzhang
 */
public abstract class AbstractFacade<T> {
    private Class<T> entityClass;
    
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected EntityManager getEntityManager()
    {
        if (emf != null && emf.isOpen()) 
        {
            return em;
        }

        HashMap<String, String> props = new HashMap<String, String>();
        
        Parameters.db_url = "jdbc:sqlserver://radonc-aria:1433;databaseName=variansystem";
        
        props.put("javax.persistence.jdbc.url", Parameters.db_url);
        props.put("javax.persistence.jdbc.user", Parameters.db_user);
        props.put("javax.persistence.jdbc.password", Parameters.db_password);
        props.put("javax.persistence.jdbc.driver", "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        try 
        {
            emf = Persistence.createEntityManagerFactory("ClinicalActivity-PU", props);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

        em = emf.createEntityManager();
        em.setProperty("javax.persistence.cache.storeMode", "BYPASS");

        return em;
    }

    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

    public List<T> getListSince(Long idSer, int maxResult)
    {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();

        CriteriaBuilder cb=getEntityManager().getCriteriaBuilder();
        
        Root<T> t = cq.from(entityClass);
        Expression<Long> idSerName = t.get("idSer");

        Predicate predicate = cb.greaterThan(idSerName, idSer);
        cq.orderBy(cb.asc(idSerName));
        cq.where(predicate);
        cq.select(t);
        if(maxResult <= 0) return getEntityManager().createQuery(cq).getResultList();
        return getEntityManager().createQuery(cq).setMaxResults(maxResult).getResultList();
    }
    
    public List<T> getListSince(Timestamp hstryDateTime, int maxResult)
    {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();

        CriteriaBuilder cb=getEntityManager().getCriteriaBuilder();
        
        Root<T> t = cq.from(entityClass);
        Expression<Timestamp> hstryDateTimeName = t.get("hstryDateTime");

        Predicate predicate = cb.greaterThan(hstryDateTimeName, hstryDateTime);
        cq.orderBy(cb.asc(hstryDateTimeName));
        cq.where(predicate);
        cq.select(t);
        if(maxResult <= 0) 
            return getEntityManager().createQuery(cq).getResultList();
        return getEntityManager().createQuery(cq).setMaxResults(maxResult).getResultList();
    }

    
    
    /*
    @Override
    //public List<ActInstProcCode> getListSince(Integer idSer) 
    public int getListSince(Integer idSer)
    {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();

        CriteriaBuilder cb=getEntityManager().getCriteriaBuilder();
        
        Root<ActInstProcCode> t = cq.from(ActInstProcCode.class);
        Expression<Integer> idSerName = t.get("idSer");

        Predicate predicate = cb.greaterThan(idSerName, idSer);
        
        cq.where(predicate);
        cq.select(t);
        
        return getEntityManager().createQuery(cq).getResultList().size();
    }
    
    */    
}
