class fig
{	
	double dim1,dim2;
	fig(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	double area()
	{	
		System.out.println("Inside area for fig:");
		return (dim1*dim2);
	}
}
class rectangle extends fig
{
	rectangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Inside area or rectangle");
		return (dim1*dim2);
	}
}
public class override
{
	public static void main(String args[])
	{
		fig f=new fig(10,10);
		rectangle r=new rectangle(5,9);
		fig figref;
		figref=f;
		System.out.println("Area:"+figref.area());
		figref=r;
		System.out.println("Area:"+figref.area());
	}
}