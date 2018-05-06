package ejb;
//package com.in28minutes.springboot.web.ejb;
//
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.PersistenceContextType;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import Data.AppointmentData;
//
//
//@Service
//@Transactional
//public class AppointmentDataServiceLogicImpl implements AppointmentDataServiceLogic {
//	
//	 @PersistenceContext(unitName = "AppointmentDataPU", type = PersistenceContextType.EXTENDED)
//	    private EntityManager entityManager;
//
//	   	@Override
//	    @Transactional
//	    public void saveAppointmentData(AppointmentData appointmentData) {
//	        entityManager.persist(appointmentData);
//	    }
//
//	    @Override
//	    public AppointmentData findAppointmentDataById(long personKey) {
//	        return entityManager.find(AppointmentData.class, personKey);
//	    }
//
//	    @Override
//	    public List<AppointmentData> findAllAppointmentData() {
//	        List<AppointmentData> allAppointmentData;
//	        allAppointmentData = entityManager.createQuery("SELECT w FROM AppointmentData w", AppointmentData.class).setMaxResults(10).getResultList();
//
//	        return allAppointmentData;
//	    }
//
//	    @Override
//	    public AppointmentData insertAppointmentData(AppointmentData appointmentData) {
//	        return null;
//	    }
//
//	}
