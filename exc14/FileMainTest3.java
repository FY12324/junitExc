package exc14;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.AssumptionViolatedException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.JVM)
public class FileMainTest3 {
	private static String s = "C:\\Users\\FY\\Desktop\\new.txt";
	private static FileMain file = new FileMain();
	
	@ClassRule 
	public static TestWatcher testWatcher = new TestWatcher() {  	      
	    protected void succeeded(Description description) {  
	        System.out.println(description.getDisplayName() + " Succeed");  
	    }  
	  
	      
	    protected void failed(Throwable e, Description description) {  
	        System.out.println(description.getDisplayName() + " Fail");  
	    }  	  
	      
	    protected void skipped(AssumptionViolatedException e, Description description) 
	{  
	        System.out.println(description.getDisplayName() + " Skipped");  
	    }  	  
	      
	    protected void starting(Description description) {  
	        System.out.println(description.getDisplayName() + " Started");  
	    }  	  
	      
	    protected void finished(Description description) {  
	        System.out.println(description.getDisplayName() + " finished");  
	    }  
	}; 

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Assume.assumeTrue(file.File(s).equals("Ferd"));
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
		file.writeFile(s,"Fred");	
	}
	
	@Test
	public void testFileT() {
		file.writeFile(s,"Hero");		
	}

}
