/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import edu.umms.radonc.aria.entity.PatientAddress;
import java.sql.Timestamp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bzhang
 */
@Local
public interface PatientAddressFacadeLocal {

    void create(PatientAddress patientAddress);

    void edit(PatientAddress patientAddress);

    void remove(PatientAddress patientAddress);

    PatientAddress find(Object id);

    List<PatientAddress> findAll();

    List<PatientAddress> findRange(int[] range);

    int count();

    Timestamp getMaxHstryDateTime();
    
    void saveList_Inc(List<PatientAddress> entityList);    
    
}
