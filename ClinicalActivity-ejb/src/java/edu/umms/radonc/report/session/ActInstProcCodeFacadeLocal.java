/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import edu.umms.radonc.aria.entity.ActInstProcCode;
import java.sql.Timestamp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bzhang
 */
@Local
public interface ActInstProcCodeFacadeLocal {

    void create(ActInstProcCode actInstProcCode);

    void edit(ActInstProcCode actInstProcCode);

    void remove(ActInstProcCode actInstProcCode);

    ActInstProcCode find(Object id);

    List<ActInstProcCode> findAll();

    List<ActInstProcCode> findRange(int[] range);

    int count();

    void commitDB();
    
    Long getMaxIdSer();
    
    //void saveList(List<ActInstProcCode> entityList);

    Timestamp getMaxHstryDateTime();
    
    void saveList_Inc(List<ActInstProcCode> entityList);    
    
}
