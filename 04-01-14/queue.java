import java.util.Scanner;
public class queue
{
	int size,front,rear;
	int a[];
	public queue(int s)
	{
		size=s;
		a=new int[size];
		front=0;
		rear=-1;
	}
	public boolean isfull()
	{
		return (rear==size-1);
	}
	public boolean isempty()
	{
		return (front>rear);
	}
	public void enque(int j)
	{	
		if(!isfull())
		{
			a[++rear]=j;
		}
		else
		{
			System.out.println("Queue is full");
		}
	}
	public int deque()
	{
		if(!isempty())
			return a[front++];
		else
			return 0;
	}
	void display()
	{
		System.out.println("Queue elements are :");
		for(int i=front;i<=rear;i++)
		{		System.out.println(a[i]);
	}}
	public static void main(String args[])
	{
		int a,i,x;
		System.out.println("enter the size of the stack");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		queue q=new queue(a);
		System.out.println("Enter"+a+"elements :");
		for(i=0;i<a;i++)
		{
			x=s.nextInt();
			 q.enque(x);
			
		}
		q.display();
		System.out.println(" enter the no.of elements to be dequed ");
		x=s.nextInt();
		System.out.println("the dequed elements:");
		for(i=0;i<x;i++)
			System.out.println(q.deque());
		q.display();
	}
}