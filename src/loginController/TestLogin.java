package loginController;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;


class TestLogin {

	@Test
	void test() throws SQLException {
		
		LoginController l1 = new LoginController();
		
		int validation = l1.valLogin("esteban", "a12345");
		
		assertEquals(2, validation, 0.0001);
	}

}
