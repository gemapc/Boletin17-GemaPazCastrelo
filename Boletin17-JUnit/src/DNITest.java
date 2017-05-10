import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DNITest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEValidoString() {
		DNI dni=new DNI();
		
		assertEquals(true,dni.eValido("53485955F"));
		assertEquals(false,dni.eValido("53485956A"));
		assertEquals(true,dni.eValido("0T"));
		assertEquals(false,dni.eValido("1X"));
		assertEquals(true,dni.eValido("123P"));
		assertEquals(false,dni.eValido("12358Y"));
	}

	/*@Test
	public void testCalculaLetraString() {
		fail("Not yet implemented");
	}

	@Test
	public void testEValidoArrayListOfIntegerChar() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculaLetraArrayListOfInteger() {
		fail("Not yet implemented");
	}*/

}
