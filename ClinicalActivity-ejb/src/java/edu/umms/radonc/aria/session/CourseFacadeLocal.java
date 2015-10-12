/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

import edu.umms.radonc.aria.entity.Course;
import java.sql.Timestamp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bzhang
 */
@Local
public interface CourseFacadeLocal {


    Course find(Object id);

    List<Course> findAll();

    List<Course> findRange(int[] range);

    int count();
    
    //List<Course> getListSince(Long idSer, int maxResult);
    
    List<Course> getListSince(Timestamp hstryDateTime, int maxResult);    
}
