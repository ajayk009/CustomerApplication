package com.app;

 class A
{
	
static
{
System.out.println("in a static block");	
System.out.println("in a static block");	
}

}

public class Trial 
{
	A ob = new A();
	
	public static void main(String[] args) {
		System.out.println("in main");
	}
	static
	{
		System.out.println("in trial  static block");
	}
}