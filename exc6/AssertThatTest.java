package ex7;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ex7.AssertThat;

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
		String[] actual;
//		1、方法一传入数据("ABC", "DEF", "GHI")，判断数组中是否包含以“DE”开头的元素；
		actual=ass.getString("ABC","DEF", "GHI");
		assertThat(actual, hasItemInArray(startsWith("DE")));
//		2、方法二传入数据("Magci", "Fred", "Hero","Alice")，判断集合中是否有“e”结尾的元素；
		List<String> actual1=ass.getList("Magci", "Fred", "Hero","Alice");
		assertThat(actual1,hasItem(endsWith("e")));
//		3、方法二传入数据("Magci", "Fred", "Hero","Alice")，判断"Magci", "Fred"在集合中并且"Tom", "Cat"不在集合中；
		List<String> actual2=ass.getList("Magci", "Fred", "Hero","Alice");
		assertThat(actual2,hasItems("Magci", "Fred"));
		assertThat(actual2,not(hasItems("Tom", "Cat")));
//		4、方法二传入数据("Magci", "Fred", "Hero","Alice")，判断集合中是否只包含"Magci", "Fred", "Hero","Alice"四个元素或者只包含"Fred", "Hero"两个元素；
		assertThat(actual2,anyOf(containsInAnyOrder("Magci", "Fred", "Hero","Alice"),containsInAnyOrder("Fred", "Hero")));
//		5、方法三传入数据("name", "Fred","age","18")，判断集合中键值对"name", "Fred"或者键值对"age","18"；
		Map<String, String> actual3=ass.getMap("name", "Fred","age","18");
		assertThat(actual3, anyOf(hasEntry("name", "Fred"),hasEntry("age","18")));
//		6、方法三传入数据("name", "Fred","age","18")，判断集合中不包含键值"weight"；
		assertThat(actual3, not(hasKey("weight")));
//		7、方法三传入数据("name", "Fred","age","18")，判断集合中包含忽略大小写的元素值"fred"。
		assertThat(actual3, hasValue(equalToIgnoringCase("fred")));

	}

}
