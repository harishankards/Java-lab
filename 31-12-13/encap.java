import java.util.Scanner;
class circle
{
	private double radius;
	public circle(double rad)
	{
		radius=rad;
	}
	public double getradius()
	{
		return radius;
	}
	public double getarea()	
	{
		return radius*radius*Math.PI;
	}
}
class encap
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter radius");
	double r=s.nextDouble();
	circle c=new circle(r);
	System.out.println("radius:"+c.getradius()+"Area:"+c.getarea());
}
}