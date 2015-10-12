/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// sybase backup: bcp variansystem.dbo.Address out xxx.txt -c -U username -P password
// sybase upload: bcp variansystem.dbo.Address in  xxx.txt -c -U username -P password
package edu.umms.radonc.aria.web;

import edu.umms.radonc.aria.entity.ActInstProcCode;
import edu.umms.radonc.aria.entity.Activity;
import edu.umms.radonc.aria.entity.ActivityCapture;
import edu.umms.radonc.aria.entity.ActivityInstance;
import edu.umms.radonc.aria.entity.Address;
import edu.umms.radonc.aria.entity.Attendee;
import edu.umms.radonc.aria.entity.Course;
import edu.umms.radonc.aria.entity.Department;
import edu.umms.radonc.aria.entity.Diagnosis;
import edu.umms.radonc.aria.entity.Doctor;
import edu.umms.radonc.aria.entity.Hospital;
import edu.umms.radonc.aria.entity.Machine;
import edu.umms.radonc.aria.entity.PatientAddress;
import edu.umms.radonc.aria.entity.PatientDoctor;
import edu.umms.radonc.aria.entity.ProcedureCode;
import edu.umms.radonc.aria.entity.Resource;
import edu.umms.radonc.aria.entity.ScheduledActivity;
import edu.umms.radonc.common.Parameters;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author bzhang
 */
@Stateless
@WebService(serviceName = "ActivityWebService")
public class ActivityWebService {

    //Aria
    @EJB
    private edu.umms.radonc.aria.session.ActInstProcCodeFacadeLocal ejbRef_aria_ActInstProcCode;
    @EJB
    private edu.umms.radonc.aria.session.ProcedureCodeFacadeLocal ejbRef_aria_ProcedureCode;
    @EJB
    private edu.umms.radonc.aria.session.DepartmentFacadeLocal ejbRef_aria_Department;
    @EJB
    private edu.umms.radonc.aria.session.HospitalFacadeLocal ejbRef_aria_Hospital;
    @EJB
    private edu.umms.radonc.aria.session.ActivityFacadeLocal ejbRef_aria_Activity;
    @EJB
    private edu.umms.radonc.aria.session.ActivityInstanceFacadeLocal ejbRef_aria_ActivityInstance;
    @EJB
    private edu.umms.radonc.aria.session.CourseFacadeLocal ejbRef_aria_Course;
    @EJB
    private edu.umms.radonc.aria.session.ActivityCaptureFacadeLocal ejbRef_aria_ActivityCapture;
    @EJB
    private edu.umms.radonc.aria.session.DoctorFacadeLocal ejbRef_aria_Doctor;
    @EJB
    private edu.umms.radonc.aria.session.MachineFacadeLocal ejbRef_aria_Machine;
    @EJB
    private edu.umms.radonc.aria.session.AttendeeFacadeLocal ejbRef_aria_Attendee;
    @EJB
    private edu.umms.radonc.aria.session.PatientDoctorFacadeLocal ejbRef_aria_PatientDoctor;
    @EJB
    private edu.umms.radonc.aria.session.ScheduledActivityFacadeLocal ejbRef_aria_ScheduledActivity;
    @EJB
    private edu.umms.radonc.aria.session.DiagnosisFacadeLocal ejbRef_aria_Diagnosis;
    @EJB
    private edu.umms.radonc.aria.session.AddressFacadeLocal ejbRef_aria_Address;
    @EJB
    private edu.umms.radonc.aria.session.PatientAddressFacadeLocal ejbRef_aria_PatientAddress;
    @EJB
    private edu.umms.radonc.aria.session.ResourceFacadeLocal ejbRef_aria_Resource;

    
    //Report
    @EJB
    private edu.umms.radonc.report.session.ActInstProcCodeFacadeLocal ejbRef_report_ActInstProcCode;
    @EJB
    private edu.umms.radonc.report.session.ProcedureCodeFacadeLocal ejbRef_report_ProcedureCode;
    @EJB
    private edu.umms.radonc.report.session.DepartmentFacadeLocal ejbRef_report_Department;
    @EJB
    private edu.umms.radonc.report.session.HospitalFacadeLocal ejbRef_report_Hospital;
    @EJB
    private edu.umms.radonc.report.session.ActivityFacadeLocal ejbRef_report_Activity;
    @EJB
    private edu.umms.radonc.report.session.ActivityInstanceFacadeLocal ejbRef_report_ActivityInstance;
    @EJB
    private edu.umms.radonc.report.session.CourseFacadeLocal ejbRef_report_Course;
    @EJB
    private edu.umms.radonc.report.session.ActivityCaptureFacadeLocal ejbRef_report_ActivityCapture;
    @EJB
    private edu.umms.radonc.report.session.DoctorFacadeLocal ejbRef_report_Doctor;
    @EJB
    private edu.umms.radonc.report.session.MachineFacadeLocal ejbRef_report_Machine;
    @EJB
    private edu.umms.radonc.report.session.AttendeeFacadeLocal ejbRef_report_Attendee;
    @EJB
    private edu.umms.radonc.report.session.PatientDoctorFacadeLocal ejbRef_report_PatientDoctor;
    @EJB
    private edu.umms.radonc.report.session.ScheduledActivityFacadeLocal ejbRef_report_ScheduledActivity;
    @EJB
    private edu.umms.radonc.report.session.DiagnosisFacadeLocal ejbRef_report_Diagnosis;
    @EJB
    private edu.umms.radonc.report.session.AddressFacadeLocal ejbRef_report_Address;
    @EJB
    private edu.umms.radonc.report.session.PatientAddressFacadeLocal ejbRef_report_PatientAddress;
    @EJB
    private edu.umms.radonc.report.session.ResourceFacadeLocal ejbRef_report_Resource;
    
    //@EJB
    //private edu.umms.radonc.aria.session.ActivityInstanceFacadeLocal ejbRef_activityInstance;
    
    
    //@WebMethod(operationName = "find")
    //public ActInstProcCode find(@WebParam(name = "id") Object id) {
    //    return ejbRef_aria_ActInstProcCode.find(id);
    //}

    /*
    @WebMethod(operationName = "findAll")
    public List<ActInstProcCode> findAll() {
        return ejbRef_aria_ActInstProcCode.findAll();
    }
    */
    //@WebMethod(operationName = "findRange")
    //public List<ActInstProcCode> findRange(@WebParam(name = "range") int[] range) {
    //    return ejbRef_aria_ActInstProcCode.findRange(range);
    //}
    public <T> void updateTable()
    {
        final int MAXRESULT = 500;
        Boolean isFinished = false;
     
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&----");

        //PatientAddress
        do
        {
            System.out.println("Starting..........PatientAddress");
            Timestamp lastTimestamp = this.ejbRef_report_PatientAddress.getMaxHstryDateTime();
            
            List<PatientAddress> patientAddressList = 
                this.ejbRef_aria_PatientAddress.getListSince(lastTimestamp, MAXRESULT);

            isFinished = true;
            
            if(patientAddressList.size() > 0)
            {
                this.ejbRef_report_PatientAddress.saveList_Inc(patientAddressList);
                isFinished = false;
            }
            System.out.println("PatientAddress ---------: " + lastTimestamp + ":");
            patientAddressList = null;
        }
        while(!isFinished);
    }

    @WebMethod(operationName = "count")
    public int count() {
        //return this.ejbRef_aria_ActInstProcCode.count();
        //return this.ejbRef_aria_ScheduledActivity.count();
        return this.ejbRef_aria_PatientAddress.count();
        //Department dept = new Department();
        
        //ejbRef_report_Department.create(null);
        //return ejbRef_aria_ActInstProcCode.getListSince(300000);
    }
    
    /*
    @WebMethod(operationName = "count_inst")
    public int count_inst() {
        return ejbRef_activityInstance.count();
    }
    */
    /**
     * Web service operation
     */
    @WebMethod(operationName = "SetParameters")
    //@Oneway
    public String SetParameters(@WebParam(name = "secret") String secret, 
            @WebParam(name = "db_url") String db_url, 
            @WebParam(name = "db_user") String db_user, 
            @WebParam(name = "db_password") String db_password) 
    {
        
        if(secret != null && secret.compareTo("2bill_7&8*") == 0)
        {
            //Parameters.db_url = db_url;
            //Parameters.secret = secret;
            Parameters.db_user = db_user;
            Parameters.db_password = db_password;
            return "Changed";
        }
        
        return "NoChange";
    }

    /**
     * Web service operation
     * @return 
     */
    @Schedule(hour="3", minute="30", dayOfWeek="*")
    public void updateReportDB_scheduled()
    {
        if(Parameters.db_user == null ||
           Parameters.db_password == null)
        {
           System.out.println("NoUpdate. Please input username/password!!!");
           return;
        }
        updateReportDB();
    }
    
    public String updateReportDB()
    {
        final int MAXRESULT = 500;
        Boolean isFinished = false;
     
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&----");

        //PatientAddress
        do
        {
            System.out.println("Starting..........PatientAddress");
            Timestamp lastTimestamp = this.ejbRef_report_PatientAddress.getMaxHstryDateTime();
            
            List<PatientAddress> patientAddressList = 
                this.ejbRef_aria_PatientAddress.getListSince(lastTimestamp, MAXRESULT);

            isFinished = true;
            
            if(patientAddressList.size() > 0)
            {
                this.ejbRef_report_PatientAddress.saveList_Inc(patientAddressList);
                isFinished = false;
            }
            System.out.println("PatientAddress ---------: " + lastTimestamp + ":");
            patientAddressList = null;
        }
        while(!isFinished);
        
        
        //Address
        do
        {
            System.out.println("Starting..........Address");
            Timestamp lastTimestamp = this.ejbRef_report_Address.getMaxHstryDateTime();
            
            List<Address> addressList = 
                this.ejbRef_aria_Address.getListSince(lastTimestamp, MAXRESULT);

            isFinished = true;
            
            if(addressList.size() > 0)
            {
                this.ejbRef_report_Address.saveList_Inc(addressList);
                isFinished = false;
            }
            System.out.println("Address ---------: " + lastTimestamp + ":");
            addressList = null;
        }
        while(!isFinished);
       
        
        //Diagnosis
        do
        {
            System.out.println("Starting..........Diagnosis");
            Timestamp lastTimestamp = this.ejbRef_report_Diagnosis.getMaxHstryDateTime();
            
            List<Diagnosis> diagnosisList = 
                this.ejbRef_aria_Diagnosis.getListSince(lastTimestamp, MAXRESULT);

            isFinished = true;
            
            if(diagnosisList.size() > 0)
            {
                this.ejbRef_report_Diagnosis.saveList_Inc(diagnosisList);
                isFinished = false;
            }
            System.out.println("Diagnosis ---------: " + lastTimestamp + ":");
            diagnosisList = null;
        }
        while(!isFinished);
        
        //PatientDoctor
        do
        {
            System.out.println("Starting..........PatientDoctor");
            //int attendeeCount = this.ejbRef_report_Attendee.count();
            //Integer lastAttendeeSer = -1;
            Timestamp lastTimestamp = this.ejbRef_report_PatientDoctor.getMaxHstryDateTime();
            //if(attendeeCount > 0)
            //{
            //    lastAttendeeSer = this.ejbRef_report_Attendee.getMaxIdSer();
            //}
            
            List<PatientDoctor> patientDoctorList = 
                this.ejbRef_aria_PatientDoctor.getListSince(lastTimestamp, MAXRESULT);

            isFinished = true;
            
            if(patientDoctorList.size() > 0)
            {
                this.ejbRef_report_PatientDoctor.saveList_Inc(patientDoctorList);
                isFinished = false;
            }
            //for(ActivityInstance activityInstance: activityInstanceList)
            //{
            //    this.ejbRef_report_ActivityInstance.create(activityInstance);
            //    isFinished = false;
            //}
            //this.ejbRef_report_ActInstProcCode.commitDB();
            System.out.println("PatientDoctor ---------: " + lastTimestamp + ":");
            patientDoctorList = null;
        }
        while(!isFinished);

        //if(true) return "OK";
        
        //ScheduledActivity
        do
        {
            System.out.println("Starting..........ScheduleActivity");
            //int actInstProcCodeCount = this.ejbRef_report_ActInstProcCode.count();
            //Integer lastScheduledActivitySer = this.ejbRef_report_ScheduledActivity.getMaxIdSer();
            Timestamp lastTimestamp = this.ejbRef_report_ScheduledActivity.getMaxHstryDateTime();

            
            List<ScheduledActivity> scheduledActivityList = 
                this.ejbRef_aria_ScheduledActivity.getListSince(lastTimestamp, MAXRESULT);

            isFinished = true;
            if(scheduledActivityList.size() > 0)
            {
                this.ejbRef_report_ScheduledActivity.saveList_Inc(scheduledActivityList);
                isFinished = false;
            }
            System.out.println("ScheduledActivity ---------: " + lastTimestamp + ":");
            scheduledActivityList = null;
        }
        while(!isFinished);

        //Department
        do
        {
            //int deptCount = this.ejbRef_report_Department.count();
            //Integer lastDeptSer = -1;
            //if(deptCount > 0)
            //{
            //    lastDeptSer = this.ejbRef_report_Department.getMaxIdSer();
            //}
            Timestamp lastTimestamp = this.ejbRef_report_Department.getMaxHstryDateTime();
            
            List<Department> deptList = this.ejbRef_aria_Department.getListSince(lastTimestamp, MAXRESULT);
    
            isFinished = true;
            
            if(deptList.size() > 0)
            {
                this.ejbRef_report_Department.saveList_Inc(deptList);
                isFinished = false;
            }
            
            //for(Department dept: deptList)
            //{
            //    this.ejbRef_report_Department.create(dept);
            //    isFinished = false;
            //}
            System.out.println("Department ---------: " + lastTimestamp + ":");
        } while(!isFinished);
        
        
        //Hospital
        do
        {
            //int hospitalCount = this.ejbRef_report_Hospital.count();
            //Integer lastHospitalSer = -1;
            //if(hospitalCount > 0)
            //{
            //    lastHospitalSer = this.ejbRef_report_Hospital.getMaxIdSer();
            //}
            Timestamp lastTimestamp = this.ejbRef_report_Hospital.getMaxHstryDateTime();
            
            List<Hospital> hospitalList = this.ejbRef_aria_Hospital.getListSince(lastTimestamp, MAXRESULT);
            isFinished = true;
            
            //for(Hospital hospital: hospitalList)
            //{
            //    this.ejbRef_report_Hospital.create(hospital);
            //    isFinished = false;
            //}
            
            if(hospitalList.size() > 0)
            {
                this.ejbRef_report_Hospital.saveList_Inc(hospitalList);
                isFinished = false;
            }
            
            System.out.println("Hospital ---------: " + lastTimestamp + ":");
        }while(!isFinished);
        
        
        //ProcedureCode
        do
        {
            //int procedureCodeCount = this.ejbRef_report_ProcedureCode.count();
            //Integer lastProcedureCodeSer = -1;
            //if (procedureCodeCount > 0) 
            //{
            //    lastProcedureCodeSer = this.ejbRef_report_ProcedureCode.getMaxIdSer();
            //}
            Timestamp lastTimestamp = this.ejbRef_report_ProcedureCode.getMaxHstryDateTime();
            List<ProcedureCode> procedureCodeList
                    = this.ejbRef_aria_ProcedureCode.getListSince(lastTimestamp, MAXRESULT);
            isFinished = true;
            //for (ProcedureCode procedureCode : procedureCodeList) 
            //{
            //    this.ejbRef_report_ProcedureCode.create(procedureCode);
            //    isFinished = false;
            //}
            if(procedureCodeList.size() > 0) 
            {
                this.ejbRef_report_ProcedureCode.saveList_Inc(procedureCodeList);
                isFinished = false;
            }
            
            System.out.println("ProcedureCode ---------: " + lastTimestamp + ":");
            procedureCodeList = null;
        }
        while(!isFinished);
        
        
        
        //Activity
        do
        {
            //int activityCount = this.ejbRef_report_Activity.count();
            //Integer lastActivitySer = -1;
            //if(activityCount > 0)
            //{
            //    lastActivitySer = this.ejbRef_report_Activity.getMaxIdSer();
            //}
            Timestamp lastTimestamp = this.ejbRef_report_Activity.getMaxHstryDateTime();
            
            List<Activity> activityList = 
                this.ejbRef_aria_Activity.getListSince(lastTimestamp, MAXRESULT);

            //if(activityList== null || activityList.size()<=0) break;
            
            isFinished = true;
            //for(Activity activity: activityList)
            //{
            //    this.ejbRef_report_Activity.create(activity);
            //    isFinished = false;
            //}
            if(activityList.size() > 0)
            {
                this.ejbRef_report_Activity.saveList_Inc(activityList);
                isFinished = false;
            }
      
            System.out.println("Activity ---------: " + lastTimestamp + ":");
            activityList = null;
        }
        while(!isFinished);
        
        
        //Course
        do
        {
            //int courseCount = this.ejbRef_report_Course.count();
            //Integer lastCourseSer = -1;
            //if(courseCount > 0)
            //{
            //    lastCourseSer = this.ejbRef_report_Course.getMaxIdSer();
            //}

            Timestamp lastTimestamp = this.ejbRef_report_Course.getMaxHstryDateTime();
            List<Course> courseList = 
                this.ejbRef_aria_Course.getListSince(lastTimestamp, MAXRESULT);

            //if(courseList== null || courseList.size()<=0) break;
            
            isFinished = true;
            
            if(courseList.size() > 0)
            {
                this.ejbRef_report_Course.saveList_Inc(courseList);
                isFinished = false;
            }
            
            //for(Course course: courseList)
            //{
            //    this.ejbRef_report_Course.create(course);
            //    isFinished = false;
            //}
            System.out.println("Course ---------: " + lastTimestamp + ":");
            courseList = null;
        }
        while(!isFinished);

        //Resource (Doctor + Machine)
        do
        {
            Timestamp lastTimestamp = this.ejbRef_report_Resource.getMaxHstryDateTime();
            List<Resource> resourceList = 
                this.ejbRef_aria_Resource.getListSince(lastTimestamp, MAXRESULT);

            //if(courseList== null || courseList.size()<=0) break;
            
            isFinished = true;
            
            if(resourceList.size() > 0)
            {
                this.ejbRef_report_Resource.saveList_Inc(resourceList);
                
                List<Machine> machineList = new ArrayList<Machine>();
                List<Doctor> doctorList = new ArrayList<Doctor>();
                
                for(Resource resource: resourceList)
                {
                    String resourceType = resource.getResourceType();
                    Long resourceId = resource.getIdSer();
                    switch(resourceType)
                    {
                        case "Doctor":
                            Doctor doctor = this.ejbRef_aria_Doctor.find(resourceId);
                            doctorList.add(doctor);
                            break;
                        case "Machine":
                            Machine machine = this.ejbRef_aria_Machine.find(resourceId);
                            machineList.add(machine);
                            break;
                    }
                }
                
                if(doctorList.size() > 0)
                {
                    this.ejbRef_report_Doctor.saveList_Inc(doctorList);
                }
                if(machineList.size() > 0)
                {
                    this.ejbRef_report_Machine.saveList_Inc(machineList);
                }
                isFinished = false;
            }
            
            //for(Course course: courseList)
            //{
            //    this.ejbRef_report_Course.create(course);
            //    isFinished = false;
            //}
            System.out.println("Course ---------: " + lastTimestamp + ":");
            resourceList = null;
        }
        while(!isFinished);
        
        /*
        // Doctor
        do
        {
            int doctorCount = this.ejbRef_report_Doctor.count();
            Long lastDoctorSer = -1L;
            if(doctorCount > 0)
            {
                lastDoctorSer = this.ejbRef_report_Doctor.getMaxIdSer();
            }

            //Timestamp lastTimestamp = this.ejbRef_report_Doctor.getMaxHstryDateTime();
            List<Doctor> doctorList = 
                this.ejbRef_aria_Doctor.getListSince(lastDoctorSer, MAXRESULT);

            //if(doctorList.size()<=0) break;
            
            isFinished = true;
            
            if(doctorList.size() > 0)
            {
                this.ejbRef_report_Doctor.saveList_Inc(doctorList);
                isFinished = false;
            }
            
            //for(Doctor doctor: doctorList)
            //{
            //    this.ejbRef_report_Doctor.create(doctor);
            //    isFinished = false;
            //}
            System.out.println("Doctor ---------: " + lastDoctorSer + ":");
            doctorList = null;
        }
        while(!isFinished);

        
        // Machine
        do
        {
            int machineCount = this.ejbRef_report_Machine.count();
            Long lastMachineSer = -1L;
            if(machineCount > 0)
            {
                lastMachineSer = this.ejbRef_report_Machine.getMaxIdSer();
            }

            //Timestamp lastTimestamp = this.ejbRef_report_Machine.getMaxHstryDateTime();
            
            List<Machine> machineList = 
                this.ejbRef_aria_Machine.getListSince(lastMachineSer, MAXRESULT);

            //if(machineList.size()<=0) break;
            
            isFinished = true;
            
            if(machineList.size() > 0)
            {
                this.ejbRef_report_Machine.saveList_Inc(machineList);
                isFinished = false;
            }
            //for(Machine machine: machineList)
            //{
            //    this.ejbRef_report_Machine.create(machine);
            //    isFinished = false;
            //}
            System.out.println("Machine ---------: " + lastMachineSer + ":");
            machineList = null;
        }
        while(!isFinished);
        */
        
        //ActivityInstance
        do
        {
            System.out.println("Starting..........ActivityInstance");
            //int activityInstanceCount = this.ejbRef_report_ActivityInstance.count();
            //Integer lastActivityInstanceSer = -1;
            //if(activityInstanceCount > 0)
            //{
            //    lastActivityInstanceSer = this.ejbRef_report_ActivityInstance.getMaxIdSer();
            //}
            Timestamp lastTimestamp = this.ejbRef_report_ActivityInstance.getMaxHstryDateTime();
            List<ActivityInstance> activityInstanceList = 
                this.ejbRef_aria_ActivityInstance.getListSince(lastTimestamp, MAXRESULT);

            isFinished = true;
            
            if(activityInstanceList.size() > 0)
            {
                this.ejbRef_report_ActivityInstance.saveList_Inc(activityInstanceList);
                isFinished = false;
            }
            //for(ActivityInstance activityInstance: activityInstanceList)
            //{
            //    this.ejbRef_report_ActivityInstance.create(activityInstance);
            //    isFinished = false;
            //}
            //this.ejbRef_report_ActInstProcCode.commitDB();
            System.out.println("ActivityInstance ---------: " + lastTimestamp + ":");
            activityInstanceList = null;
        }
        while(!isFinished);
        
        //ActivityCapture
        do
        {
            //int activityCaptureCount = this.ejbRef_report_ActivityCapture.count();
            //Integer lastActivityCaptureSer = -1;
            //if(activityCaptureCount > 0)
            //{
            //    lastActivityCaptureSer = this.ejbRef_report_ActivityCapture.getMaxIdSer();
            //}
            Timestamp lastTimestamp = this.ejbRef_report_ActivityCapture.getMaxHstryDateTime();
            
            List<ActivityCapture> activityCaptureList = 
                this.ejbRef_aria_ActivityCapture.getListSince(lastTimestamp, MAXRESULT);

            if(activityCaptureList== null || activityCaptureList.size()<=0) break;
            
            isFinished = true;
            
            if(activityCaptureList.size() > 0)
            {
                this.ejbRef_report_ActivityCapture.saveList_Inc(activityCaptureList);
                isFinished = false;
            }
            //utx.begin();
            //for(ActivityCapture activityCapture: activityCaptureList)
            //{
            //    this.ejbRef_report_ActivityCapture.create(activityCapture);
            //    isFinished = false;
            //}
            //utx.commit();
           
            System.out.println("ActivityCapture ---------: " + lastTimestamp + ":");
            activityCaptureList = null;
        }
        while(!isFinished);
        
        //Attendee
        do
        {
            System.out.println("Starting..........Attendee");
            //int attendeeCount = this.ejbRef_report_Attendee.count();
            //Integer lastAttendeeSer = -1;
            //if(attendeeCount > 0)
            //{
            //    lastAttendeeSer = this.ejbRef_report_Attendee.getMaxIdSer();
            //}
            Timestamp lastTimestamp = this.ejbRef_report_Attendee.getMaxHstryDateTime();
            List<Attendee> attendeeList = 
                this.ejbRef_aria_Attendee.getListSince(lastTimestamp, MAXRESULT);

            isFinished = true;
            
            if(attendeeList.size() > 0)
            {
                this.ejbRef_report_Attendee.saveList_Inc(attendeeList);
                isFinished = false;
            }
            //for(ActivityInstance activityInstance: activityInstanceList)
            //{
            //    this.ejbRef_report_ActivityInstance.create(activityInstance);
            //    isFinished = false;
            //}
            //this.ejbRef_report_ActInstProcCode.commitDB();
            System.out.println("Attendee ---------: " + lastTimestamp + ":");
            attendeeList = null;
        }
        while(!isFinished);
        
        //ActInstProcCode
        do
        {
            System.out.println("Starting..........ActInstProcCode");
            //int actInstProcCodeCount = this.ejbRef_report_ActInstProcCode.count();
            //Integer lastActInstProcCodeSer = this.ejbRef_report_ActInstProcCode.getMaxIdSer();
            Timestamp lastTimestamp = this.ejbRef_report_ActInstProcCode.getMaxHstryDateTime();
            
            List<ActInstProcCode> actInstProcCodeList = 
                this.ejbRef_aria_ActInstProcCode.getListSince(lastTimestamp, MAXRESULT);

            isFinished = true;
            if(actInstProcCodeList.size() > 0)
            {
                this.ejbRef_report_ActInstProcCode.saveList_Inc(actInstProcCodeList);
                isFinished = false;
            }
            System.out.println("ActInstProcCode ---------: " + lastTimestamp + ":");
            actInstProcCodeList = null;
        }
        while(!isFinished);

        return "OK";
    }
    
    @WebMethod(operationName = "UpdateReportDBfromAria")
    public String UpdateReportDBfromAria(@WebParam(name = "secret") String secret) 
    {
        if(secret != null && secret.compareTo("2bill_7&8*") == 0)
        {
            return updateReportDB();
        }
        return "OK!!!";
    }
}
