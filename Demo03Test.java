package com;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo03Test {
	Scanner scanner=new Scanner(System.in);
	Demo03 demo03=new Demo03();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("请输入用户名");
		String user=scanner.nextLine();
		System.out.println("请输入密码：");
		String password=scanner.nextLine();
		assertEquals(demo03.register(user, password),false);
	}

}
