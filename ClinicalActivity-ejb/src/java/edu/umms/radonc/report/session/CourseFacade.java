/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import edu.umms.radonc.aria.entity.Course;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author bzhang
 */
@Stateless(name="edu.umms.radonc.report.session.CourseFacade")
@TransactionManagement(TransactionManagementType.BEAN)
public class CourseFacade extends AbstractFacade<Course> implements CourseFacadeLocal {
    //@Resource 
    //UserTransaction utx;
    public CourseFacade() {
        super(Course.class);
    }
    
}
