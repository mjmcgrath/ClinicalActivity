/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

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

    PatientAddress find(Object id);

    List<PatientAddress> findAll();

    List<PatientAddress> findRange(int[] range);

    int count();

    List<PatientAddress> getListSince(Timestamp hstryDateTime, int maxResult);
    
}
