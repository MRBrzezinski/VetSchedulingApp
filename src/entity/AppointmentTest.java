import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * 
 */

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AppointmentTest.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}
}
/**
 * @author Allen Thomas
 * Unit test cases for the appointment class
 * 
 * This will ensure stability between the API's and verify that the internals
 * of the class are functioning as expected.
 * 
 */
public class AppointmentTest {

	// Internal appointment class used for testing
	private Appointment m_Appointment;
	
	/**
	 * @throws java.lang.Exception
	 * Initializes the test suite
	 */
	@Before
	public void setUp() throws Exception {
		m_Appointment = new Appointment();
	}

	/**
	 * @throws java.lang.Exception
	 * Uninitializes the test suite
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test that the default constructor is functioning properly
	 */
	@Test
	public void TestNoConstructor() {
		m_Appointment = new Appointment();
		
		if (m_Appointment.getId() != 0)
			fail("default appointment id set to non-zero.");
		
		if (m_Appointment.getFirstName() != "")
			fail("default first name is not clear.");
		
		if (m_Appointment.getLastName() != "")
			fail("default last name is not clear.");
		
		if (m_Appointment.getEmail() != "")
			fail("default email is not clear.");
		
		System.out.println("TestNoConstructor test succeeded.");
	}
	
	/**
	 * Test that the supplied arguments constructor is functioning properly
	 */
	@Test
	public void TestSuppliedConstructor() {
		m_Appointment = new Appointment(1, "FirstName", "LastName", "FirstName@LastName.com");
		
		if (m_Appointment.getId() == 0)
			fail("default appointment id set to zero.");
		
		if (m_Appointment.getFirstName() == "")
			fail("default first name is clear.");
		
		if (m_Appointment.getLastName() == "")
			fail("default last name is clear.");
		
		if (m_Appointment.getEmail() == "")
			fail("default email is not clear.");
		
		System.out.println("TestSuppliedConstructor test succeeded.");
	}
	
	/**
	 * Test the id functionality works
	 */
	@Test
	public void TestId() {
		m_Appointment = new Appointment(1, "A", "B", "A@B.C");
		
		if (m_Appointment.getId() != 1)
			fail("getId fail.");
		
		m_Appointment.setId(2);
		
		if (m_Appointment.getId() != 2)
			fail("getId setId fail.");
		
		System.out.println("TestId test succeeded.");
	}
	
	/**
	 * Test the name functionality works
	 */
	@Test
	public void TestName() {
		m_Appointment = new Appointment(1, "A", "B", "A@B.C");
		
		if (m_Appointment.getFirstName() != "A")
			fail("getFirstName fail.");
		
		m_Appointment.setFirstName("AA");
		
		if (m_Appointment.getFirstName() != "AA")
			fail("getFirstName setFirstName fail.");
		
		if (m_Appointment.getLastName() != "B")
			fail("getLastName fail.");
		
		m_Appointment.setLastName("BB");
		
		if (m_Appointment.getLastName() != "BB")
			fail("getLastName setLastName fail.");
		
		System.out.println("TestName test succeeded.");
	}
	
	/**
	 * Test the email functionality works
	 */
	@Test
	public void TestEmail() {
		m_Appointment = new Appointment(1, "A", "B", "A@B.C");
		
		if (m_Appointment.getEmail() != "A@B.C")
			fail("email construct fail.");
		
		m_Appointment.setEmail("AA@BB.CC");
		
		if (m_Appointment.getEmail() != "AA@BB.CC")
			fail("email fail.");
		
		System.out.println("TestEmail test succeeded.");
	}

}
