/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

import edu.umms.radonc.aria.entity.ProcedureCode;
import java.sql.Timestamp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bzhang
 */
@Local
public interface ProcedureCodeFacadeLocal {

    ProcedureCode find(Object id);

    List<ProcedureCode> findAll();

    List<ProcedureCode> findRange(int[] range);

    int count();
    
    //List<ProcedureCode> getListSince(Long idSer, int maxResult);

    List<ProcedureCode> getListSince(Timestamp hstryDateTime, int maxResult);    
}
