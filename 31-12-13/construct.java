class example
{
	private int c;
	public example()
	{
		c=0;
		System.out.println("default");
		System.out.println("C="+c);
	}
	public example(int value)
	{
		c=value;
		System.out.println("parametrized");
		System.out.println("C="+c);
	}
}
public class construct
{
	public static void main(String args[])
	{
		example c1=new example();
		example c2=new example(10);
	}
}
	