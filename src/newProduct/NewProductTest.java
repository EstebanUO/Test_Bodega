package newProduct;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class NewProductTest {

	@Test
	void test() throws SQLException {
		
		NewProduct n1 = new NewProduct();
		
		int validation = n1.clickNuevo("arroz", "5000", "2500", "400", "15", "65");
		
		assertEquals(2, validation, 0.0001);
	}

}
