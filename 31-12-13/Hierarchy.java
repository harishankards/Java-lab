class A
{
	void displayA()
	{
		System.out.println("In A");
	}
}
class B extends A
{
	void displayB()
	{
		System.out.println("In B");
	}
}
class C extends A
{
	void displayC()
	{
		System.out.println("In C");
	}
}
public class Hierarchy
{
	public static void main(String args[])
	{
		System.out.println("Subclass C");
		C c=new C(); c.displayA(); c.displayC();
		System.out.println("Subclass B");
		B b=new B(); b.displayA(); b.displayB();
	}
}