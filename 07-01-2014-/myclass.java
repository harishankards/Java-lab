public class myclass
{
	public void displaya()
	{
		System.out.println("my class");
	}
	public void displayb()
	{
		System.out.println("my class");
	}
	public static void main(String args [])
	{
		classb b=new classb();
		b.displaya();
		b.displayb();
		b=new myclass();
		b.displaya();
		b.displayb();
	}
}