import java.util.Scanner;
class threading
{
	String name,branch;
	int roll;
	public void put(String s1,int r,String s2)
	{
		name=s1;
		roll=r;
		branch=s2;
	}
	public void get()
	{
		System.out.println("Name="+name+"\n Roll_num="+roll+"\n Branch="+branch);
	}
}
public class ther
{
	public static void main(String args[])
	{
		threading n=new threading();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the name,branch,rollnum:");
		String s1=s.nextLine();
		String s2=s.nextLine();
		int r=s.nextInt();
		n.put(s1,r,s2);
		n.get();
	}
}