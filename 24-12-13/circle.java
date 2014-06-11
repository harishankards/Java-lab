import java.util.Scanner;
public class circle
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);	
		System.out.println("Enter radius");
		double r=in.nextDouble();
		double area=Math.PI*(r*r);
		System.out.println("Area:"+area);
		System.out.println("Circumference:"+circum(r));
	}
	public static double circum(double rad)
	{
		return Math.PI*2*rad;
	}
}