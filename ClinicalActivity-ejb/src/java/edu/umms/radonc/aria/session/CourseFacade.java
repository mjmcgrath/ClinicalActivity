/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

import edu.umms.radonc.aria.entity.Course;
import javax.ejb.Stateless;

/**
 *
 * @author bzhang
 */
@Stateless(name="edu.umms.radonc.aria.session.CourseFacade")
public class CourseFacade extends AbstractFacade<Course> implements CourseFacadeLocal {

    public CourseFacade() {
        super(Course.class);
    }
    
}
