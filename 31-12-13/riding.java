import java.util.Scanner;
class shape
{
	double x,y;
	public shape()
	{
		x=0;
		y=0;
	}
	Scanner s=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter x and y value :");	
		x=s.nextDouble();
		y=s.nextDouble();
	}
	void print()
	{
		System.out.println("values of x and y: \n"+x+"\n"+y);
	}
}
class rectangle extends shape
{
	double l,b;
	rectangle(double x,double y)
	{
		l=x;
		b=y;
	}
	void print()
	{
		System.out.println("values of l and b: \n"+l+"\n"+b);
	}
}
public class riding
{
	public static void main(String arg[])
	{
		shape s=new shape();
		s.get();
		rectangle r=new rectangle(5,9);
		shape sh;
		s.print();
		sh=r;
		r.print();
	}
}