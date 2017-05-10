import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class XeometriaTest {

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
	public void testPerimetroCadrado() {
		Xeometria xeometria=new Xeometria();
		
		assertEquals(0,xeometria.perimetroCadrado(0));
		assertEquals(8,xeometria.perimetroCadrado(2));
		assertEquals(12,xeometria.perimetroCadrado(3));
		assertEquals(-1,xeometria.perimetroCadrado(-2));
	}

	@Test
	public void testAreaCadrado() {
		Xeometria xeometria=new Xeometria();
		
		assertEquals(0,xeometria.areaCadrado(0));
		assertEquals(4,xeometria.areaCadrado(2));
		assertEquals(8,xeometria.areaCadrado(4));
		assertEquals(-1,xeometria.areaCadrado(-2));
	}

	@Test
	public void testTeoremaPitagorasIntInt() {
		Xeometria xeometria=new Xeometria();
		
		assertEquals(25,xeometria.teoremaPitagoras(7,24),0.01);
		assertEquals(2.24,xeometria.teoremaPitagoras(1,2),0.01);
		assertEquals(0,xeometria.teoremaPitagoras(0,0),0.01);
		assertEquals(-1,xeometria.teoremaPitagoras(-7,24),0.01);
		assertEquals(-1,xeometria.teoremaPitagoras(7,-24),0.01);
		assertEquals(-1,xeometria.teoremaPitagoras(-7,-24),0.01);
	}

	@Test
	public void testTeoremaPitagorasDoubleDouble() {
		Xeometria xeometria=new Xeometria();
		
		assertEquals(24,xeometria.teoremaPitagoras(25.0,7.0),0.01);
		assertEquals(1,xeometria.teoremaPitagoras(2.24,2),0.01);
		assertEquals(0,xeometria.teoremaPitagoras(0,0),0.01);
		assertEquals(-1,xeometria.teoremaPitagoras(-25,7),0.01);
		assertEquals(-1,xeometria.teoremaPitagoras(25,-7),0.01);
		assertEquals(-1,xeometria.teoremaPitagoras(-25,-7),0.01);
		assertEquals(-1,xeometria.teoremaPitagoras(7.0,25.0),0.01);
	}

}
