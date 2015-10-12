/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

import edu.umms.radonc.aria.entity.Department;
import java.sql.Timestamp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bzhang
 */
@Local
public interface DepartmentFacadeLocal {

    Department find(Object id);

    List<Department> findAll();

    List<Department> findRange(int[] range);

    int count();

    //List<Department> getListSince(Long idSer, int maxResult);
    
    List<Department> getListSince(Timestamp hstryDateTime, int maxResult);    
}
