/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import edu.umms.radonc.aria.entity.Machine;
import java.sql.Timestamp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bzhang
 */
@Local
public interface MachineFacadeLocal {

    void create(Machine machine);

    void edit(Machine machine);

    void remove(Machine machine);

    Machine find(Object id);

    List<Machine> findAll();

    List<Machine> findRange(int[] range);

    int count();

    Long getMaxIdSer();
    
    //void saveList(List<Machine> entityList);

    Timestamp getMaxHstryDateTime();
    
    void saveList_Inc(List<Machine> entityList);    
    
}
