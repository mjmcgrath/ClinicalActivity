/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import edu.umms.radonc.aria.entity.Attendee;
import java.sql.Timestamp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bzhang
 */
@Local
public interface AttendeeFacadeLocal {

    void create(Attendee attendee);

    void edit(Attendee attendee);

    void remove(Attendee attendee);

    Attendee find(Object id);

    List<Attendee> findAll();

    List<Attendee> findRange(int[] range);

    int count();

    Long getMaxIdSer();
    
    //void saveList(List<Attendee> entityList);

    Timestamp getMaxHstryDateTime();
    
    void saveList_Inc(List<Attendee> entityList);    
    
}
