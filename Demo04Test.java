package com;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo04Test {
	Scanner s=new Scanner(System.in);
	Demo04 demo04=new Demo04();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("«Î ‰»Î»˝±ﬂ£∫");
		String list=s.nextLine();
		String strs[]=list.split(" ");
		int a=Integer.parseInt(strs[0]);
		int b=Integer.parseInt(strs[1]);
		int c=Integer.parseInt(strs[2]);
		assertEquals(1, demo04.isTriangle(a, b, c));
	}

}
