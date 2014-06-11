import java.util.Scanner;
public class price
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the price in rupees");	
		double p,r;
		p=s.nextDouble();
		r=p*100;
		System.out.println("Price in paise is "+(int)r);
	}
}