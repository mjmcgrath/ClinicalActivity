/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

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

    ActivityCapture find(Object id);

    List<ActivityCapture> findAll();

    List<ActivityCapture> findRange(int[] range);

    int count();

    //List<ActivityCapture> getListSince(Long idSer, int maxResult);

    List<ActivityCapture> getListSince(Timestamp hstryDateTime, int maxResult);
    
}
