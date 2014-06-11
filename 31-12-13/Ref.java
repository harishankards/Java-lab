class number
{
	int x;
}
public class Ref
{
	public static void increment1(int a)
	{
		a++;
	}
	public static void increment2(number n)
	{
		n.x=n.x+1;
	}
	public static void main(String args[])
	{
		int a=5;
		System.out.println("Before increment of a,a="+a);
		increment1(a);
		System.out.println("After increment of a,a="+a);
		number num=new number();
		num.x=5;
		System.out.println("Before increment,num.x:"+num.x);
		increment2(num);
		System.out.println("After increment,num.x:"+num.x);
	}
}