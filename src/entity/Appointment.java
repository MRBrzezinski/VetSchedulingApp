package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import Enums.AppointmentType;
import Enums.EstimatedWeight;
import Enums.PetGender;
import Enums.PetType;


@Entity
public class Appointment {
	@Id
	@Column(name = "CUSTOMER_ID")
    private int id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    
    @Column(name = "PET_TYPE")
    @Enumerated(EnumType.STRING)
    private PetType petType;
    
    @Column(name = "PET_GENDER")
    @Enumerated(EnumType.STRING)
    private  PetGender petGender;
    
    @Column(name = "ESTIMATED_WEIGHT")
    @Enumerated(EnumType.STRING)
    private EstimatedWeight estimatedWeight;
    
    @Column(name = "APPOINTMENT_TYPE")
    @Enumerated(EnumType.STRING)
    private AppointmentType appointmentType;
 
	
	public Appointment() {
		
	}
	
	public Appointment(int id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
	
	
	

}
