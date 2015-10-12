/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

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

    ActivityInstance find(Object id);

    List<ActivityInstance> findAll();

    List<ActivityInstance> findRange(int[] range);

    int count();
    
    //List<ActivityInstance> getListSince(Long idSer, int maxResult);
    
    List<ActivityInstance> getListSince(Timestamp hstryDateTime, int maxResult);    
    
}