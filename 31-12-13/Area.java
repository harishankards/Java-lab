class dimension
{
	int l,b;
}
class rectangle extends dimension
{
	int a;
	void area()
	{
		a=l*b;
	}
}
class Area
{
	public static void main(String args[])
	{
		rectangle dim=new rectangle();
		dim.l=10;
		dim.b=5;
		dim.area();
		System.out.println("Area:"+dim.a);
	}
}