/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

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

    void create(ProcedureCode procedureCode);

    void edit(ProcedureCode procedureCode);

    void remove(ProcedureCode procedureCode);

    ProcedureCode find(Object id);

    List<ProcedureCode> findAll();

    List<ProcedureCode> findRange(int[] range);

    int count();
    
    Long getMaxIdSer();
    
    Timestamp getMaxHstryDateTime();
    
    //void saveList(List<ProcedureCode> entityList);
    
    void saveList_Inc(List<ProcedureCode> entityList);
}
