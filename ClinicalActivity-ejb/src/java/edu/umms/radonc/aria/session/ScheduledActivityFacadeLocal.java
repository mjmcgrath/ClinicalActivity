/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

import edu.umms.radonc.aria.entity.ScheduledActivity;
import java.sql.Timestamp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bzhang
 */
@Local
public interface ScheduledActivityFacadeLocal {

    ScheduledActivity find(Object id);

    List<ScheduledActivity> findAll();

    List<ScheduledActivity> findRange(int[] range);

    int count();

    //List<ScheduledActivity> getListSince(Long idSer, int maxResult);
    
    List<ScheduledActivity> getListSince(Timestamp hstryDateTime, int maxResult);
}
