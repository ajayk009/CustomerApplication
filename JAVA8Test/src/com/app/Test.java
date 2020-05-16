package com.app;

class Base
{
	public static void display()
	{
		System.out.println("IN BASE");
	}
}
class Derived extends Base
{
	public static void display()
	{
		System.out.println("IN DERIVED");
	}
}

public class Test 
{
	public static void main(String[]args)
	{
		Base obj1 = new Derived();
		obj1.display();
	}
}
