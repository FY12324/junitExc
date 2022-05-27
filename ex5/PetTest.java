package exc5;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PetTest {
	Pet pet=new Pet("Tomcat", 5);
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
//		1、信息为：名称“Tomcat”、年龄“5”；
//		2、判断名称中是否包含“om”；
		assertThat(pet.getName(), containsString("om"));
//		3、判断名称是否以“To”开头；
		assertThat(pet.getName(), startsWith("To"));
//		4、判断名称是否以“at”结束；
		assertThat(pet.getName(),endsWith("at"));
//		5、判断名称是否是“Tomcat”；
		assertThat(pet.getName(), equalTo("Tomcat"));
//		6、判断名称忽略大小写是否同“tomCat”一致；
		assertThat(pet.getName(), equalToIgnoringCase("tomCat"));
//		7、判断名称忽略头尾空格是否同“  Tomcat  ”一致；
		assertThat(pet.getName(), equalToIgnoringWhiteSpace("  Tomcat  "));
//		8、判断年龄是否是“5”。
		assertThat(pet.getAge(),is(5) );
	}

}
