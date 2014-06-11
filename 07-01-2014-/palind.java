import java.util.Scanner;
class check_palindrome
{
	static int a,b=0,c=0;
	static int palin(int pal)	
	{
		a=pal;
		while(a>0)
		{
			b=(a%10);
			c=b+(c*10);
			a=a/10;
		}
		if(c==pal)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
class make_palindrome extends check_palindrome
{
	static int count1,count2;
	static int make(int pal)
	{
		int a=pal,b=pal,x,y;
		while(true)
		{
			a=a+1;
			count1++;
			x=check_palindrome.palin(a);
			if(x==1)
			{
				break;
			}
		}
		while(true)
		{
			b=b-1;
			count2++;
			y=palin(b);
			if(y==1)
			{
				break;
			}
		}
		if(count1<=count2)
		{
			return count1;
		}
		else
		{
			return count2;
		}
	}
}
public class palind
{
	public static void main(String args[])
	{
		int p,a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		p=s.nextInt();
		check_palindrome ch=new check_palindrome();
		a=ch.palin(p);
		if(a==1)
		{
			System.out.println("it is a palindrome");
		}
		else	
		{
			System.out.println("count is 2"+make_palindrome.make(p));
		}
	}
}