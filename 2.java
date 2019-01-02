import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class A
{
	A()
	{
		System.out.println("default constructor");
	}
	A(int a)
	{
		System.out.println("Argumented constructor \t a : "+a);
	}
}
class B extends A
{
	B()
	{
		super();
	}
	B(int a)
	{
		super(a);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		new B();
		new B(400);
	}
}
