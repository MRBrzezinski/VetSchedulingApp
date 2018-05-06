package ejb;

import java.util.List;

import entity.Appointment;


public interface AppointmentDataServiceLogic {
		
		void saveAppointmentData(Appointment appointmentData);

		Appointment findAppointmentDataById(int id);

	    List<Appointment> findAllAppointmentData();

	    Appointment insertAppointmentData (Appointment appointmentData);

	}
