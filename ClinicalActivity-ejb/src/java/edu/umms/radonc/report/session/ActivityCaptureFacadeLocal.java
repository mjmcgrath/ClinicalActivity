/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import edu.umms.radonc.aria.entity.ActivityCapture;
import java.sql.Timestamp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bzhang
 */
@Local
public interface ActivityCaptureFacadeLocal {

    void create(ActivityCapture activityCapture);

    void edit(ActivityCapture activityCapture);

    void remove(ActivityCapture activityCapture);

    ActivityCapture find(Object id);

    List<ActivityCapture> findAll();

    List<ActivityCapture> findRange(int[] range);

    int count();
    
    Long getMaxIdSer();
    
    //void saveList(List<ActivityCapture> entityList);
    
    Timestamp getMaxHstryDateTime();
    
    void saveList_Inc(List<ActivityCapture> entityList);    

}
