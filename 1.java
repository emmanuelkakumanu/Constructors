
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	Ideone()
	{
		System.out.println("Defalut constructor");
	}
	Ideone(int a)
	{
		System.out.println("one Argumented constructor : a="+a);
	}
	Ideone(int a,int b)
	{
		System.out.println("two argumented constructor : a="+a+"\tb="+b);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Ideone obj1=new Ideone();
		Ideone obj2=new Ideone(5);
		Ideone obj3=new Ideone(55,77);
	}
}
