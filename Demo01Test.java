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
        // �Ӽ��̽�������
        System.out.println("�������һ����");
        int a=scan.nextInt();
        System.out.println("������ڶ�����");
        int b=scan.nextInt();
        System.out.println("�������3����");
        int c=scan.nextInt();
        System.out.println("�������4����");
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
