import java.util.Scanner;
public class factorial
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int f=1;
		int n;
		n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			f*=i;
		}
		System.out.println("Factorial of"+n+"is:"+f);
	}
}