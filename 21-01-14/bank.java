import java.util.Scanner;
class acc_exception extends Exception
{
	static double bal,min;
	int uid;
	String name;
	public acc_exception(double a,double b,int id,String s)
	{
		bal=a;
		min=b;
		uid=id;
		name=s;
	}
	public acc_exception(String pro)
	{
		super(pro);
	}
}
public class bank
{
	public static void main(String args[]) throws acc_exception
	{
		acc_exception n=new acc_exception(10000,500,101,"Harish");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the amount to withdraw");
		double withdraw=s.nextDouble();
		if(n.bal-withdraw<n.min)
		{
			System.out.println("You can withdraw only"+(n.bal-n.min));
			acc_exception e=new acc_exception("No Balance");
			throw e;
		}
		else
		{
			System.out.println("Amount remaining:"+(n.bal-withdraw));
		}
}}