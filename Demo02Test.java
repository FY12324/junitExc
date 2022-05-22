package com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo02Test {
	double actual=0;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculate() {
		 actual=Demo02.calculate(1, 1);
		 System.out.println(actual);
		 assertEquals(-0.9999902065507035, actual,0.0);
	}
	@Test
	public void testCalculate1() {
		 actual=Demo02.calculate(-1, -1);
		 System.out.println(actual);
		 assertEquals(actual,1,0.0);
	}

	@Test
	public void testCalculate2() {
		 actual=Demo02.calculate(0, 0);
		 System.out.println(actual);
		 assertEquals(actual,0,0.0);
	}

}
