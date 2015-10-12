/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

import edu.umms.radonc.aria.entity.Hospital;
import java.sql.Timestamp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bzhang
 */
@Local
public interface HospitalFacadeLocal {

    Hospital find(Object id);

    List<Hospital> findAll();

    List<Hospital> findRange(int[] range);

    int count();

    //List<Hospital> getListSince(Long idSer, int maxResult);    

    List<Hospital> getListSince(Timestamp hstryDateTime, int maxResult);    
    
}


