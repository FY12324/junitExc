package ex9;

import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class FunctionTest {
	private Function func=new Function();
	private int x,y,z,expected;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Parameters
	public static Collection userData() {
	// 数组中,包含了传入参数和期望结果，数组参数顺序与构造函数参数顺序一致即可  
		   return Arrays.asList(new Object[][]{
			{2,2,0,1},
			{1,2,1,2},
			{2,1,0,3},
			{1,1,1,2}});		
		}

	public FunctionTest(int x,int y,int z,int expected) {
		this.x=x;
		this.y=y;
		this.z=z;
		this.expected=expected;
		
	}

	@Test
	public void testFunction() {
		assertEquals(expected, func.function(x, y, z),0.0);
	}

	
}
