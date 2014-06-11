import java.util.Scanner;
public class series
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value");
		double d=0;
		for(int i=1;i<=3;i++)
		{		
			d=d+(1/i);
		}
		System.out.print("Sum is"+d);
	}	
}