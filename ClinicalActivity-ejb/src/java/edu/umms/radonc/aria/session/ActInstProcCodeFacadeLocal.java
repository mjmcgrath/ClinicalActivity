/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

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

    ActInstProcCode find(Object id);

    List<ActInstProcCode> findAll();

    List<ActInstProcCode> findRange(int[] range);

    int count();
    //public List<ActInstProcCode> getListSince(Integer idSer);
    //List<ActInstProcCode> getListSince(Long idSer, int maxResult);
    
    List<ActInstProcCode> getListSince(Timestamp hstryDateTime, int maxResult);    
}
