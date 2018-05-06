/**
 * 
 */
package webapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Allen Thomas
 *
 */
class LoginServiceTest {

	private LoginService m_LoginService;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		m_LoginService = new LoginService();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link webapp.LoginService#validateUser(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testValidateUser() {
		if (m_LoginService == null)
			fail("login service not created.");
		
		if (!m_LoginService.validateUser("GroupFour", "password"))
			fail("could not validate default user.");
	}

}
