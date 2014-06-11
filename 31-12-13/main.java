class A
{
	public void printA()
	{
		System.out.println("In class A");
	}
}
class B extends A
{
	public void printB()
	{	
		System.out.println("In class B");
	}
}
class C extends B
{
	public void printC()
	{
		System.out.println("In class C");
	}
}
public class main
{
	public static void main(String args[])
	{
		A x=new A(); x.printA();
		B y=new B(); y.printA(); y.printB();
		C z=new C(); z.printA(); z.printB(); z.printC();
	}
}