package ex6;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AssertThatTest {
	AssertThat ass=new AssertThat();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		double actual;
//		1、减法方法计算8.8-7.5，判断计算的值大于1或者小于2；
		ass.substract(8.8,7.5);
		actual=ass.getResultOne();
		assertThat(actual, closeTo(1.5,0.5));
//		2、减法方法计算8.8-7.5，判断计算的值大于等于1或者小于等于1.5；
		ass.clear();
		ass.substract(8.8, 7.5);
		actual=ass.getResultOne();
		assertThat(actual,greaterThanOrEqualTo(1.0));
		assertThat(actual,lessThanOrEqualTo(1.5));
//		3、减法方法计算8.8-7.5；判断计算的值在1±0.5范围内并且也在2±0.8范围内；
		ass.clear();
		ass.substract(8.8, 7.5);
		actual=ass.getResultOne();
		assertThat(actual,anyOf(closeTo(1, 0.5),closeTo(2, 0.8)));
	}
}
