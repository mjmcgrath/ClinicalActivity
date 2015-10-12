/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.report.session;

import edu.umms.radonc.aria.entity.PatientDoctor;
import java.sql.Timestamp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bzhang
 */
@Local
public interface PatientDoctorFacadeLocal {

    void create(PatientDoctor patientDoctor);

    void edit(PatientDoctor patientDoctor);

    void remove(PatientDoctor patientDoctor);

    PatientDoctor find(Object id);

    List<PatientDoctor> findAll();

    List<PatientDoctor> findRange(int[] range);

    int count();

    Timestamp getMaxHstryDateTime();
    
    //void saveList(List<PatientDoctor> entityList);    
    
    void saveList_Inc(List<PatientDoctor> entityList);    
}
