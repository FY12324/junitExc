package exc3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
//  1、用户的信息
	Person person=new Person("Fred", 18, "男", "13612251254", null, 170,65);
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//	2、使用assertSame判断用户名称为“Fred”；
	@Test
	public void test1() {
		String name=person.getName();
		assertSame("Fred", name);
	}
//	3、使用assertNotSame判断用户名称不为“Hero”；
	@Test
	public void test3() {
		String name=person.getName();
		assertNotSame("Hero", name);
	}
//	4、使用assertEquals判断年龄为18岁；
	@Test
	public void test4() {
		int age=person.getAge();
		assertEquals(18, age);
	}
//	5、使用assertTrue验证性别为男；
	@Test
	public void test5() {
		int sex=person.getSex();
		assertEquals(1, sex);
	}
//	6、使用assertFalse验证性别不为女；
	@Test
	public void test6() {
		int sex=person.getSex();
		assertFalse(sex==0);
	}
//	7、使用assertNull验证其他属性为null；
	@Test
	public void test7() {
		assertNull(person.getCode());
	}
//	8、使用assertNotNull验证电话号码不为空；
	@Test
	public void test8() {
		assertNotNull(person.getNo());
	}
//	9、使用assertArrayEquals验证身高和体重为170，65。
	@Test
	public void test9() {
		int[] actuals=person.getHeigwei();
		int[] expected={170,65};
		assertArrayEquals(expected, actuals);
	}
}
