package exc16;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class CalculatorTest {

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
	@Rule
	public TestName name=new TestName();
	@Test
	public void testA() {
		System.out.println("This name is"+name.getMethodName());
	}
	@Test
	public void testB() {
		System.out.println("This name is"+name.getMethodName());
	}

}
