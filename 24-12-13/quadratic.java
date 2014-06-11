import java.util.Scanner;
public class quadratic
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		float a,b,c,d;
		double d1,r1,r2;
		System.out.print("enter the numbers");
		a=s.nextFloat();
		b=s.nextFloat();
		c=s.nextFloat();
		d=(b*b)-(4*a*c);
		System.out.println("d="+d);
		if(d<0)
			System.out.println("No real roots");
		else if(d==0)
			System.out.print("equal roots");
		else
		{
			System.out.println("real roots");
			d1=Math.sqrt(d);
			r1=-b+d1/(2*a);
			r2=-b-d1/(2*a);
			System.out.print("real roots"+"d1="+d1+" r1="+r1+" r2="+r2);
		}
	}
}