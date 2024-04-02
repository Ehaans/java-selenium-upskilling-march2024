package com.allianz.selfstudy;


public class MethodOverloadingEx1 { //example with non static methods
	
	public int sum() //no input some output
	{
		System.out.println("M1");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	public int sum(int c,int d, int e) //input and output
	{
		System.out.println("M2");
		return(c+d+e);
	}
	public int sum(int x, int y) //input and output
	{
		System.out.println("M3");
		return(x+y);
	}
	public void sum(int f, int g, int h, int i) //input and no output
	{
		System.out.println("M4");
		int j=f+g+h;
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		MethodOverloadingEx1 obj1=new MethodOverloadingEx1();
		System.out.println(obj1.sum());
		System.out.println(obj1.sum(11,12,13));
		System.out.println(obj1.sum(1, 14));
		obj1.sum(2,3,4,5);
	}

}
