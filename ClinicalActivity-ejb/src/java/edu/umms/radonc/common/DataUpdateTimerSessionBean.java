/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umms.radonc.common;

import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author bzhang
 */
@Stateless
@LocalBean
public class DataUpdateTimerSessionBean {
    @EJB
    private edu.umms.radonc.aria.session.ActInstProcCodeFacadeLocal ejbRef_aria_ActInstProcCode;
    @EJB
    private edu.umms.radonc.aria.session.ProcedureCodeFacadeLocal ejbRef_aria_ProcedureCode;
    @EJB
    private edu.umms.radonc.aria.session.DepartmentFacadeLocal ejbRef_aria_Department;
    @EJB
    private edu.umms.radonc.aria.session.HospitalFacadeLocal ejbRef_aria_Hospital;

    
    @EJB
    private edu.umms.radonc.report.session.ActInstProcCodeFacadeLocal ejbRef_report_ActInstProcCode;
    @EJB
    private edu.umms.radonc.report.session.ProcedureCodeFacadeLocal ejbRef_report_ProcedureCode;
    @EJB
    private edu.umms.radonc.report.session.DepartmentFacadeLocal ejbRef_report_Department;
    @EJB
    private edu.umms.radonc.report.session.HospitalFacadeLocal ejbRef_report_Hospital;

    //@Schedule(minute = "*", second = "0", dayOfMonth = "*", month = "*", year = "*", hour = "9-17", dayOfWeek = "Mon-Fri")
    //@Schedule(minute = "*/1", hour = "*")
    public void dataUpdate() 
    {
        System.out.println("Timer event: " + new Date());
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
