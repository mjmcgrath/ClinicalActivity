/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

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

    void create(Course course);

    void edit(Course course);

    void remove(Course course);

    Course find(Object id);

    List<Course> findAll();

    List<Course> findRange(int[] range);

    int count();

    Long getMaxIdSer();
    
    //void saveList(List<Course> courseList);
    
    Timestamp getMaxHstryDateTime();
    
    void saveList_Inc(List<Course> entityList);    
    
}
