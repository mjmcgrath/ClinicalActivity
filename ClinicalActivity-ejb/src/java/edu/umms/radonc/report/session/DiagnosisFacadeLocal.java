/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import edu.umms.radonc.aria.entity.Diagnosis;
import java.sql.Timestamp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bzhang
 */
@Local
public interface DiagnosisFacadeLocal {

    void create(Diagnosis diagnosis);

    void edit(Diagnosis diagnosis);

    void remove(Diagnosis diagnosis);

    Diagnosis find(Object id);

    List<Diagnosis> findAll();

    List<Diagnosis> findRange(int[] range);

    int count();

    Timestamp getMaxHstryDateTime();
    
    void saveList_Inc(List<Diagnosis> entityList);    
    
}
