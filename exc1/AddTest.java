package exc1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddTest {
	Calculator cal=new Calculator();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		cal.add(2);
		int actual=cal.getResult();
		assertEquals(2, actual);
	}
	
	@Test
	public void test1() {
		cal.add(7);
		int actual=cal.getResult();
		assertEquals(9, actual);
	}

}
