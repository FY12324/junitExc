package exc5;

public class Pet {
	private static String name;
	private static int age;
	public Pet(String namep,int agep) { 
	    name = namep;
	    age = agep;		
	}  
	//获取名称
	public String getName() {
	    return name;		
	}
	//获取年龄
	public int getAge() {
	    return age;
	}
} 	
