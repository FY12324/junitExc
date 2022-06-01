package exc15;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.DEFAULT)
public class FileMainTest {
	FileMain f=new FileMain();
	String s="C:\\Users\\FY\\Desktop\\new.txt";
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
//	1、添加3个测试方法，测试方法一在文件中写入“Fred”，在测试方法中判断文件中内容是否为“Fred”。
	@Test
	public void testFile() {
		f.writeFile(s,"Fred" );
		Assume.assumeTrue(f.File(s).equals("Fred"));
	}
//	2、测试方法二在文件中写入“Hero”，在测试方法中判断文件中内容是否为“Fred”，两个测试方式使用顺序执行。
	@Test
	public void testReadAsString() {
		f.writeFile(s,"Hero" );
		Assume.assumeTrue(f.File(s).equals("Hero"));
	}
//	3、测试方法三在文件中写入“Fred”，再写入“Hero”，判断文件中只有内容为“Fred”才执行，否则跳过。
	@Test
	public void testWriteFile() {
		f.writeFile(s,"Fred");
		f.writeFile(s,"Hero");
		Assume.assumeTrue(f.File(s).contentEquals("Fred"));
	}

}
