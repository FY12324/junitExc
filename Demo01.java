package com;

public class Demo01 {
	public int calcu(int a,int b,int c,int d) {
		int Y;
		if ((a>12&&b<13)&&(c>4||d<20)) {
				Y=3*a+10*b+5*d-c;
		}else {
			Y=10*d-(a+b)*c/5;
		}
		return Y;
	}
	
}
