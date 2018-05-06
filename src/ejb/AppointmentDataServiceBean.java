package ejb;
//package com.in28minutes.springboot.web.ejb;
//
//
//import Data.AppointmentData;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.ejb.Stateless;
//import javax.ejb.TransactionAttribute;
//import javax.ejb.TransactionAttributeType;
//import java.util.List;
//
//@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
//@Stateless(name = "AppointmentDataServiceBean", mappedName = "AppointmentDataServiceBean")
//public class AppointmentDataServiceBean implements AppointmentDataServiceLocal, AppointmentDataServiceRemote, AppointmentDataServiceLogic {
// 
//
//	    @Autowired 
//	    AppointmentDataServiceLogic  appointmentDataServiceLogic;
//
//	    public AppointmentDataServiceBean() {}
//
//	    @Override
//	    @TransactionAttribute(TransactionAttributeType.REQUIRED)
//	    public void saveAppointmentData(AppointmentData appointmentData) {
//	        appointmentDataServiceLogic.saveAppointmentData(appointmentData);
//	    }
//
//	    @Override
//	    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
//	    public AppointmentData findAppointmentDataById(long personKey) {
//	        return appointmentDataServiceLogic.findAppointmentDataById(personKey);
//	    }
//
//	    @Override
//	    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
//	    public List<AppointmentData> findAllAppointmentData() {
//	        return appointmentDataServiceLogic.findAllAppointmentData();
//	    }
//
//	    @Override
//	    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
//	    public AppointmentData insertAppointmentData (AppointmentData appointmentData) {
//	        return appointmentDataServiceLogic.insertAppointmentData(appointmentData);
//	    }
//
//}
