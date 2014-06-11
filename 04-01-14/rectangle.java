import java.util.Scanner;
class rect
{
	private double width,breadth;
	private String color;
	rect()
	{
		width=breadth=1;
		color="white";
	}
	rect(double w,double b,String c)
	{
		width=w;
		breadth=b;
		color=c;
	}
	String printcolor()
	{
		return color;
	}
	double getarea()
	{
		return (width*breadth);
	}
	double getperi()
	{
		return (2*(width+breadth));
	}
	
}
public class rectangle
{
	public static void main(String args[])
	{
		double a,b;
		String c;
		Scanner s=new Scanner(System.in);
		rect r1=new rect();
		System.out.println("Enter width,breadth and color:");
		c=s.nextLine();	
		a=s.nextDouble();
		b=s.nextDouble();
		rect r2=new rect(a,b,c);
		System.out.println("For default Rectangle: \n color is "+r1.printcolor()+"\nArea is"+r1.getarea()+"\n perimeter is"+r1.getperi());
		System.out.println("For our Rectangle: \n color is "+r2.printcolor()+"\nArea is"+r2.getarea()+"\n perimeter is"+r2.getperi());
	}
}