import java.util.Scanner;
class interest
{
	double interest;
	public interest(double d)
	{	
		interest=d;
	}
	public double getinterest()
	{
		return interest;
	}
}
public class si
{
	public static void main(String args[])
	{
		double p,n,r;
		Scanner s=new Scanner(System.in);
		p=s.nextDouble();
		n=s.nextDouble();
		r=s.nextDouble();
		interest i=new interest(r);
		System.out.print("Simple interest is "+((p*n*i.getinterest())/100));
	}
}