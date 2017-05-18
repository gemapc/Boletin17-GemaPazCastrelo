package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Boletin17.DNI;

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
		assertEquals(false,dni.eValido("1A358Y"));
		assertEquals(false,dni.eValido("-1A358Y"));
		assertEquals(false,dni.eValido("-1A35878"));
	}

	@Test
	public void testCalculaLetraString() {
		DNI dni=new DNI();
		
		assertEquals('F',dni.calculaLetra("53485955"));
		assertEquals(-1,dni.calculaLetra("5A485956"));
		assertEquals('T',dni.calculaLetra("0"));
		assertEquals('P',dni.calculaLetra("123"));
		assertEquals('F',dni.calculaLetra("12358"));
		assertEquals(-1,dni.calculaLetra("-12358"));
	}

	@Test
	public void testEValidoArrayListOfIntegerChar() {
		DNI dni=new DNI();
		ArrayList<Integer> numeros1 = new ArrayList<Integer>(
					Arrays.asList(5,3,4,8,5,9,5,5));
		ArrayList<Integer> numeros2 = new ArrayList<Integer>(
				Arrays.asList(0));
		ArrayList<Integer> numeros3 = new ArrayList<Integer>(
				Arrays.asList(1,2,3));
		ArrayList<Integer> numeros4 = new ArrayList<Integer>(
				Arrays.asList(1,2,3,5,8));
		
		assertEquals(true,dni.eValido(numeros1,'F'));
		assertEquals(false,dni.eValido(numeros1,'A'));
		assertEquals(true,dni.eValido(numeros2,'T'));
		numeros2.set(0,1);
		assertEquals(false,dni.eValido(numeros2,'X'));
		assertEquals(true,dni.eValido(numeros3,'P'));
		assertEquals(false,dni.eValido(numeros4,'Y'));
		numeros4.set(0,10);
		assertEquals(false,dni.eValido(numeros4,'Y'));
		numeros4.set(0,-1);
		assertEquals(false,dni.eValido(numeros4,'Y'));
	}

	@Test
	public void testCalculaLetraArrayListOfInteger() {
		DNI dni=new DNI();
		ArrayList<Integer> numeros1 = new ArrayList<Integer>(
					Arrays.asList(5,3,4,8,5,9,5,5));
		ArrayList<Integer> numeros2 = new ArrayList<Integer>(
				Arrays.asList(0));
		ArrayList<Integer> numeros3 = new ArrayList<Integer>(
				Arrays.asList(1,2,3));
		ArrayList<Integer> numeros4 = new ArrayList<Integer>(
				Arrays.asList(1,2,3,5,8));
		
		assertEquals('F',dni.calculaLetra(numeros1));
		assertEquals('T',dni.calculaLetra(numeros2));
		assertEquals('P',dni.calculaLetra(numeros3));
		assertEquals('F',dni.calculaLetra(numeros4));
		numeros4.set(0,10);
		assertEquals(-1,dni.calculaLetra(numeros4));
		numeros4.set(0,-1);
		assertEquals(-1,dni.calculaLetra(numeros4));
	}

}
