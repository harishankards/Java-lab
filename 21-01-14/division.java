import java.io.*;
public class division
{
	public static void main(String args[])
	{
		int a=10,b=0,result;
		System.out.println("Numbers are:"+a+"\t"+b);	
		try
		{
			result=a/b;
			System.out.println("Result:"+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Division by zero"+e);
		}
	}
}