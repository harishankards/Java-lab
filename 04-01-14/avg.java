import java.util.Scanner;
public class avg
{
	public double avrg(double a,double b,double c)
	{
		if(a>b && a>c)
		{
			if(b>c)
			{		
				return (a+b)/2;
			}
			else
			{
				return (a+c)/2;
			}
		}
		else if(b>a && b>c)
		{
			if(a>c)
			{
				return (a+b)/2;
			}
			else
			{
				return (b+c)/2;
			}
		}
		else
		{
			if(a>b)
			{
				return (a+c)/2;
			}
			else
			{
				return (b+c)/2;
			}
		}
	}	public static void main(String args[])
		{
			avg av=new avg();
			System.out.println(" enter 3 elements");
			Scanner s=new Scanner(System.in);
			double a,b,c;
			a=s.nextDouble();
			b=s.nextDouble();
			c=s.nextDouble();
			System.out.println(" the best average is"+av.avrg(a,b,c));
		}
}