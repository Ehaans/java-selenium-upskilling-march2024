package com.allianz.selfstudy;

public class MethodOverloadingEx2 {
	
	public static int sum() //no input some output
	{
		System.out.println("M1");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	public static int sum(int c,int d, int e) //input and output
	{
		System.out.println("M2");
		return(c+d+e);
	}
	public static int sum(int x, int y) //input and output
	{
		System.out.println("M3");
		return(x+y);
	}
	public static void sum(int f, int g, int h, int i) //input and no output
	{
		System.out.println("M4");
		int j=f+g+h;
		System.out.println(j);
	}

	public static void main(String[] args) {
		System.out.println(MethodOverloadingEx2.sum());
		System.out.println(MethodOverloadingEx2.sum(10, 20));
		System.out.println(MethodOverloadingEx2.sum(1, 2, 3));
		MethodOverloadingEx2.sum(10, 20, 30, 40);

	}

}
