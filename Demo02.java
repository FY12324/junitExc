package com;
import java.lang.Math;
public class Demo02 {
	public static double calculate(int a,int b) {	
		double c;
		if (a>0&b>0) {
			c=Math.sin(a+b*10);
		}else{
			if (a<0&b<0) {
				 c=Math.pow((a*b), 3);
			}else {
				 c=Math.pow((a-b), 2);
			}
		}
		return c;
	}
	public static void main(String[] args) {
		System.out.println(Demo02.calculate(-1,-1));
	}
}
