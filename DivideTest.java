package lib;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DivideTest {
	public static Calculator calculator=new Calculator();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void test() {
		calculator.clear();
		calculator.divide(2);
		int actual=calculator.getResult();
		assertEquals(2, actual);
	}
	
	@Test
	public void test1() {
		calculator.clear();
		calculator.divide(12);
		int actual=calculator.getResult();
		assertEquals(12, actual);
	}

}
