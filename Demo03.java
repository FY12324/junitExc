package com;

import java.util.Scanner;

public class Demo03 {
	public boolean register(String user,String password) {
		if(user.length()==8&&Character.isUpperCase(user.charAt(0))) {
			if (password.length()>8) {
				System.out.println("注册成功！");
				return true;
			}else {
				System.out.println("密码不符合要求");
				return false;
			}
		}else{
			System.out.println("用户名不符合要求");
			return false;
		}
	}
}
