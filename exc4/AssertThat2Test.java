package ex4;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AssertThat2Test {
	AssertThat2 ass=new AssertThat2();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

//	1、减法方法计算10-7，判断计算的值在2和4之间；
	@Test
	public void test1() {
		ass.substract(10, 7);
		int actual=ass.getResult();
		assertThat(actual, allOf(greaterThan(2),lessThan(4)));
	}
//	2、减法方法计算10-7，判断计算的值大于2或者小于1；
	@Test
	public void test2() {
		ass.substract(10, 7);
		int actual=ass.getResult();
		assertThat(actual, anyOf(greaterThan(2),lessThan(1)));
	}
//	3、减法方法计算10-7，判断计算的值大于4或者小于7；
	@Test
	public void test3() {
		ass.substract(10, 7);
		int actual=ass.getResult();
		assertThat(actual, anyOf(greaterThan(4),lessThan(7)));
	}
//	4、减法方法计算10-7，判断无论什么条件都测试通过；
	@Test
	public void test4() {
		ass.substract(10, 7);
		int actual=ass.getResult();
		assertThat(actual, anything());
	}
//	5、减法方法计算10-7，判断是否等于3；
	@Test
	public void test5() {
		ass.substract(10, 7);
		int actual=ass.getResult();
		assertThat(actual, is(3));
	}
//	6、减法方法计算10-7，判断不等于2；
	@Test
	public void test6() {
		ass.substract(10, 7);
		int actual=ass.getResult();
		assertThat(actual, not(2));
	}
//	7、除法方法计算8/4，判断计算的值在1和3之间；
	@Test
	public void test7() {
		ass.divide(8, 4);
		int actual=ass.getResult();
		assertThat(actual,allOf(greaterThan(1),lessThan(3)) );
	}
//	8、除法方法计算8/4，判断计算的值大于1或者小于1；
	@Test
	public void test8() {
		ass.divide(8, 4);
		int actual=ass.getResult();
		assertThat(actual,anyOf(greaterThan(1),lessThan(1)) );
	}
//	9、除法方法计算8/4，判断计算的值大于8或者小于3；
	@Test
	public void test9() {
		ass.divide(8, 4);
		int actual=ass.getResult();
		assertThat(actual,anyOf(greaterThan(8),lessThan(3)) );
	}
//	10、除法方法计算8/4，判断无论什么条件都测试通过；
	@Test
	public void test10() {
		ass.divide(8, 4);
		int actual=ass.getResult();
		assertThat(actual,anything() );
	}
//	11、除法方法计算8/4，判断是否等于2；
	@Test
	public void test11() {
		ass.divide(8, 4);
		int actual=ass.getResult();
		assertThat(actual,is(2));
	}
//	12、除法方法计算8/4，判断不等于1。
	@Test
	public void test12() {
		ass.divide(8, 4);
		int actual=ass.getResult();
		assertThat(actual,not(1));
	}
	

}
