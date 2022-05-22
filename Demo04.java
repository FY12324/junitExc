package com;
public class Demo04 {
	public int isTriangle(int a,int b,int c) {
		if ((a<=10&&a>=1)&&(b<=10&&b>=1)&&(c<=10&&c>=1)) {
			if ((a+b>c)||(a+c>b)||(b+c>a)) {
				if ((a==b)||(b==c)||(a==c)) {
					if (a==b&&a==c) {
						System.out.println("能组成等边三角形");
						return 1;
					}else {
						System.out.println("能组成等腰三角形");
						return 2;
					}
				}else {
					System.out.println("能组成普通三角形");
					return 3;
				}
			}
		}else {
			System.out.println("输入的边值不在范围内，请重新输入");
			return 4;
		}
		return 0;
	}
}
