/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

import edu.umms.radonc.aria.entity.Resource;
import java.sql.Timestamp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bzhang
 */
@Local
public interface ResourceFacadeLocal {

    
    //void create(Resource resource);

    //void edit(Resource resource);

    //void remove(Resource resource);

    Resource find(Object id);

    List<Resource> findAll();

    List<Resource> findRange(int[] range);

    int count();
    
    List<Resource> getListSince(Timestamp hstryDateTime, int maxResult);    
    
}
