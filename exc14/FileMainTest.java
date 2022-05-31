package exc14;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.AssumptionViolatedException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FileMainTest {
	public static FileMain f=new FileMain();
	public static String s="C:\\Users\\FY\\Desktop\\new.txt";
	
	@ClassRule
	public static TestWatcher testWatcher=new TestWatcher() {
		protected void succeeded(Description description) {
			System.out.println(description.getDisplayName()+"Succeed");
		}
		
		protected void failed(Throwable e,Description description) {
			System.out.println(description.getDisplayName()+"Fail");
		}
		
		protected void skipped(AssumptionViolatedException e,Description description) {
			System.out.println(description.getDisplayName()+"Skipped");
		}
		
		protected void starting(Description description) {
			System.out.println(description.getDisplayName()+"Started");
		}
		
		protected void finished(Description description) {
			System.out.println(description.getDisplayName()+"Finished");
		}
	};
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			System.out.println("BeforeClass");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		assertEquals("Hero", f.File(s));
		System.out.println("AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	@Test
	public void test1() {
		f.writeFile(s, "Fred");
	}
	
	@Test
	public void test2() {
		f.writeFile(s, "Hero");
	}
}
