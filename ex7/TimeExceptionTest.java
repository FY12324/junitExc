package ex8;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TimeExceptionTest {
	TimeException te=new TimeException();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(timeout = 500)
	public void test() {
//		1、sum测试方法设置超时时间为500毫秒；
		te.sum();
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test1() {
//		2、array测试方法传入数组下标越界，判断数组下标越界异常。
		te.array(4);
	}

}
