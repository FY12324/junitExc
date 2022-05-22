package com;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo01Test {
	private static Demo01 demo1=new Demo01();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalcu() {
//		int actual=demo1.calcu(0, 0, 0, 0);
//		assertEquals(actual, 0);
		Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
        System.out.println("请输入第一个数");
        int a=scan.nextInt();
        System.out.println("请输入第二个数");
        int b=scan.nextInt();
        System.out.println("请输入第3个数");
        int c=scan.nextInt();
        System.out.println("请输入第4个数");
        int d=scan.nextInt();
            int actual=demo1.calcu(a,b,c,d);
    		assertEquals(actual, 0);
        }
		
	}
	
//	@Test
//	public void testCalcu1() {
//		int actual=demo1.calcu(13,0,0,0);
//		assertEquals(actual, 39);
//		
//	}

//}
