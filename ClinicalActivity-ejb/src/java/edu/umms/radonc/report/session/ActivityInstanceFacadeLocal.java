/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import edu.umms.radonc.aria.entity.ActivityInstance;
import java.sql.Timestamp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bzhang
 */
@Local
public interface ActivityInstanceFacadeLocal {

    void create(ActivityInstance activityInstance);

    void edit(ActivityInstance activityInstance);

    void remove(ActivityInstance activityInstance);

    ActivityInstance find(Object id);

    List<ActivityInstance> findAll();

    List<ActivityInstance> findRange(int[] range);

    int count();
    
    Long getMaxIdSer();
    
    //void saveList(List<ActivityInstance> activityInstanceList);

    Timestamp getMaxHstryDateTime();
    
    void saveList_Inc(List<ActivityInstance> entityList);    
    
}
