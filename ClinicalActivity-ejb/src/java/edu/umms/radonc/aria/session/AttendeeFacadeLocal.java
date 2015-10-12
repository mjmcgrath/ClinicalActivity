/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

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

    Attendee find(Object id);

    List<Attendee> findAll();

    List<Attendee> findRange(int[] range);

    int count();
    
    //List<Attendee> getListSince(Long idSer, int maxResult);
    
    List<Attendee> getListSince(Timestamp hstryDateTime, int maxResult);    
    
}
