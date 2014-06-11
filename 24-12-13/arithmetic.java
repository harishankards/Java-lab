import java.util.Scanner;
public class arithmetic
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a,b,c,d,e,f,g;
		System.out.println("enter the two values");
		a=in.nextInt();
		b=in.nextInt();
		c=a+b;
		d=a-b;
		e=a*b;
		f=a/b;
		g=a%b;
		System.out.println("sum:"+c);
		System.out.println("Difference:"+d);
		System.out.println("product:"+e);
		System.out.println("Quotient:"+f);
		System.out.println("Remainder:"+g);
	}
}
				