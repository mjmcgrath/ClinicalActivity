/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

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

    PatientDoctor find(Object id);

    List<PatientDoctor> findAll();

    List<PatientDoctor> findRange(int[] range);

    int count();
    
    List<PatientDoctor> getListSince(Timestamp hstryDateTime, int maxResult);    
}
