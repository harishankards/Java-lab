import java.util.Scanner;
abstract class stud
{
	String name;
	int roll_no,marks;
	abstract void student_detail(int a,String s,int c);
}
class stud_detail extends stud
{
	static int max;
	static String na;
	static int c,rr,j;
	void student_detail(int roll,String name1,int mar)
	{
		name=name1;
		roll_no=roll;
		marks=mar;
		if(max<marks)
		{
			na=name;
			rr=roll_no;
			max=marks;
		}
	}
}
public class detail
{
	public static void main(String args [])
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;;i++)
		{
			System.out.println(" enter the rollno,nameand mark:");
			int r=s.nextInt();
			if(r==0)
			{
				break;
			}
			String n=s.nextLine();
			int m=s.nextInt();
			stud_detail std=new stud_detail();
			std.student_detail(r,n,m);
			stud_detail.j++;
		}
		System.out.println("topper");
		System.out.println("Name:"+stud_detail.na+"roll no:"+stud_detail.rr+"Marks:"+stud_detail.max);
		System.out.println("No.of instances :"+stud_detail.j);
	}
}	