package exc1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MultiplyTest {
	Calculator calculator=new Calculator();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		calculator.clear();
		calculator.multiply(3);
		int actual=calculator.getResult();
		System.out.println(actual);
		assertEquals(3, actual);
	}
	
	@Test
	public void test1() {
		calculator.multiply(3);
		int actual=calculator.getResult();
		System.out.println(actual);
		assertEquals(9, actual);
	}
}
