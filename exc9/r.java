5、编写测试代码，用初始化的参数进行测试。
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RegisterTest {
	private Register register = new Register();
	private String username;
	private String password;
	private boolean expected;
	
//测试数据集合，方法名可以随意定义，返回类型可变，但是必须用@Parameters标注 
	@Parameters
	public static Collection userData() {
	// 数组中,包含了传入参数和期望结果，数组参数顺序与构造函数参数顺序一致即可  
	  return Arrays.asList(new Object[][]{
		{"Admin","123456",true},
		{"student","123456",false},
		{"Admin","123",false}});		
	}
	//构造函数，参数赋值顺序与测试数据集合一致  
	public RegisterTest(String username,String password,boolean expected) {
		this.username = username;
		this.password = password;
		this.expected = expected;
	}
	@Test
	public void testLogOn() {		
	    assertEquals(expected,register.LogOn(username,password));
	}		
}	
