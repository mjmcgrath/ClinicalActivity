/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

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

    void create(ScheduledActivity scheduledActivity);

    void edit(ScheduledActivity scheduledActivity);

    void remove(ScheduledActivity scheduledActivity);

    ScheduledActivity find(Object id);

    List<ScheduledActivity> findAll();

    List<ScheduledActivity> findRange(int[] range);

    int count();

    Long getMaxIdSer();

    Timestamp getMaxHstryDateTime();
            
    //void saveList(List<ScheduledActivity> entityList);

    void saveList_Inc(List<ScheduledActivity> entityList);

}


