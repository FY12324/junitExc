package exc1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SubstractTest {
	Calculator calculator=new Calculator();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		calculator.substract(2);
		int actual=calculator.getResult();
		assertEquals(2, actual);
		calculator.clear();
	}
	
	@Test
	public void test1() {
		calculator.substract(6);
		int actual=calculator.getResult();
		assertEquals(5, actual);
	}

}
