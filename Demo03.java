package com;

import java.util.Scanner;

public class Demo03 {
	public boolean register(String user,String password) {
		if(user.length()==8&&Character.isUpperCase(user.charAt(0))) {
			if (password.length()>8) {
				System.out.println("ע��ɹ���");
				return true;
			}else {
				System.out.println("���벻����Ҫ��");
				return false;
			}
		}else{
			System.out.println("�û���������Ҫ��");
			return false;
		}
	}
}
