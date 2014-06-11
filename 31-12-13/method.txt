public class method
{
	public static int avg(int x,int y)
	{
		return (x+y)/2;
	}
	public static double avg(double x,double y)
	{
		return (x+y)/2;
	}
	public static int avg(int a,int b,int c)
	{
		return (a+b+c)/3;
	}
	public static void main(String args[])
	{
		System.out.println(avg(6,8));
		System.out.println(avg(2.5,3.5));	
		System.out.println(avg(1,2,3));
		System.out.println(avg(2.0,3));
	}
}