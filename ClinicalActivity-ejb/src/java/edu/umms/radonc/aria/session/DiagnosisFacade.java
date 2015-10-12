/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.aria.session;

import edu.umms.radonc.aria.entity.Diagnosis;
import javax.ejb.Stateless;

/**
 *
 * @author bzhang
 */
@Stateless(name="edu.umms.radonc.aria.session.DiagnosisFacade")
public class DiagnosisFacade extends AbstractFacade<Diagnosis> implements DiagnosisFacadeLocal {

    public DiagnosisFacade() {
        super(Diagnosis.class);
    }
    
}
