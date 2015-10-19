package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class BilletautomatTest {

	Billetautomat automat = new Billetautomat();
	@Test
	public void testGetTotal() {
		//		fail("Not yet implemented");

		automat.indsætPenge(30);
		automat.udskrivBillet();
		automat.montørLogin("1234");
		automat.setBilletpris(20);
		automat.udskrivBillet();
		assertEquals(30, automat.getTotal());
	}

	@Test
	public void testNegativtBeløb() {
		//		fail("Not yet implemented");

		automat.indsætPenge(-100);
		assertEquals(0, automat.getBalance());
		
	}
}
