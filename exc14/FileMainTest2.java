package exc14;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.AssumptionViolatedException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class FileMainTest2 {
	private static FileMain f=new FileMain();
	private static String s="‪C:\\Users\\FY\\Desktop\\new.txt";
	
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
		assertEquals("Fred", f.File(s));
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
	public void testFileO() {
		f.writeFile(s,"Fred");	
	}
	
	@Test
	public void testFileT() {
		f.writeFile(s,"Hero");		
	}


}
