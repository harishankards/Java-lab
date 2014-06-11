import java.util.Scanner;
public class palindrome
{	
	public static void main(String args[])
	{
		String a,b="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string");
		a=in.nextLine();
		int length=a.length();
		for(int i=length-1;i>=0;i--)
			b=b+a.charAt(i);
		if(a.equals(b))
			System.out.println("palindrome");
		else
			System.out.println(" not a palindrome");
	}
}