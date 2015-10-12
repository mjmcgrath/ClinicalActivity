/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import java.sql.Timestamp;
import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;

/**
 *
 * @author bzhang
 */
public abstract class AbstractFacade<T> {
    private Class<T> entityClass;
    
    @Resource
    UserTransaction utx;
    
    @PersistenceContext(unitName = "ActivityReporting-PU")
    private EntityManager em;

    //@Resource
    //private UserTransaction utx;
    
    protected EntityManager getEntityManager() {
        return em;
    }

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    //protected abstract EntityManager getEntityManager();
    /*
    public void saveList(List<T> entityList)
    {
        //UserTransaction utx;
        if(entityList != null && entityList.size() > 0)
        {
            
                //getEntityManager().getEntityManagerFactory().getCache().
                //getEntityManager().getTransaction().begin();
                for(T entity: entityList)
                {
                    getEntityManager().persist(entity);
                    //getEntityManager().flush();
                }
            
            //getEntityManager().getTransaction().commit();
        }
    }
    */
    public void create(T entity) {
        //getEntityManager().getTransaction().begin();
        getEntityManager().persist(entity);
        getEntityManager().flush();
        //getEntityManager().getTransaction().commit();
    }

    public void commitDB() {
        //getEntityManager().getTransaction().begin();
        getEntityManager().getTransaction().commit();
        //getEntityManager().flush();
        //getEntityManager().getTransaction().commit();
    }
    
    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
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
    
    public Long getMaxIdSer()
    {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();

        CriteriaBuilder cb=getEntityManager().getCriteriaBuilder();
        
        Root<T> t = cq.from(entityClass);
        Expression<Long> idSerName = t.get("idSer");

        cq.select(cb.max(idSerName));
    
        try
        {
            Long maxSer = (Long)getEntityManager().createQuery(cq).getSingleResult();
            if(maxSer == null) return -1L;
            return maxSer;
        }
        catch(NoResultException e)
        {
            return -1L;
        }
    }
    public Timestamp getMaxHstryDateTime()
    {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();

        CriteriaBuilder cb=getEntityManager().getCriteriaBuilder();
        
        Root<T> t = cq.from(entityClass);
        Expression<Integer> hstryDateTimeName = t.get("hstryDateTime");

        cq.select(cb.greatest(hstryDateTimeName));
        
        try
        {
            Timestamp maxHstryDateTime = 
                (Timestamp)getEntityManager().createQuery(cq).getSingleResult();
            if(maxHstryDateTime == null)
                return Timestamp.valueOf("1900-01-01 01:01:01");
            return maxHstryDateTime;
        }
        catch(NoResultException e)
        {
            return Timestamp.valueOf("1900-01-01 01:01:01");
        }
    }
    
    public void saveList_Inc(List<T> entityList)
    {
        //UserTransaction utx;
        if(entityList.size() > 0)
        {
            try
            {
                //getEntityManager().getEntityManagerFactory().getCache().
                //getEntityManager().getTransaction().begin();
                utx.begin();
                for(T entity: entityList)
                {
                    getEntityManager().merge(entity);
                    //getEntityManager().flush();
                }
                utx.commit();
            //getEntityManager().getTransaction().commit();
            }
            catch(Exception e)
            {
                System.out.println("BullError0-----" + entityClass.getSimpleName());
                e.printStackTrace();
                System.out.println("BullError1-----" + entityClass.getSimpleName());
            }
        }
    }
    
}
