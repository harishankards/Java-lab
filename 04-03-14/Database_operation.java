import java.sql.*;
import java.util.Scanner;
public class Database_operation
{
	public static void main(String args[])
	{
		Connection con=null;
		try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:hari");
Statement sta=con.createStatement();
int count=0,i,j,c;
String nam,add,table;
Scanner s=new Scanner(System.in);
System.out.println("\nEnter the table name:");
table=s.nextLine();

int ij=sta.executeUpdate("create table "+table+"(name varchar(30),addr varchar(30))");
//System.out.println("\nEnter the no of rows to be inserted:");
//i=s.nextInt();
//for(j=0;j<i;j++)
//{
System.out.println("\nEnter the username:");
nam=s.nextLine();
System.out.println("\nEnter the address:");
add=s.nextLine();
c=sta.executeUpdate("insert into "+table+"(name,addr) values('"+nam+"','"+add+"')");
count=count+c;
//}
System.out.println("\nEnter the username:");
nam=s.nextLine();
System.out.println("\nEnter the address:");
add=s.nextLine();
c=sta.executeUpdate("insert into "+table+"(name,addr) values('"+nam+"','"+add+"')");
count=count+c;
System.out.println("\nEnter the username:");
nam=s.nextLine();
System.out.println("\nEnter the address:");
add=s.nextLine();
c=sta.executeUpdate("insert into "+table+"(name,addr) values('"+nam+"','"+add+"')");
count=count+c;
System.out.println("No of rows inserted:"+count);
ResultSet rs=sta.executeQuery("select * from "+table);
int co = 0;
while(rs.next())
{
System.out.println("\nName:"+rs.getString(1)+"\tAddress:"+rs.getString(2));
}
int check;

do {
co++;
if( co > 1) 
System.out.println("invalid name... please enter again");
System.out.println("\nEnter the username whom you want to update:");
nam=s.nextLine();



//String update="select * from "+ table +" where name='"+nam +"'";
rs=sta.executeQuery("select * from "+ table +" where name='"+nam +"'");

}while(!rs.next());




System.out.println("\nEnter the address to update:");
add=s.nextLine();
String update="update "+table+" set addr='"+add+"' where name='"+nam +"'";
System.out.println(update);
int update_count=sta.executeUpdate(update);
//"update address set addr=add where name=nam");
System.out.println("No of rows updated:"+update_count);
rs=sta.executeQuery("select * from "+table);
while(rs.next())
{
System.out.println("\nName:"+rs.getString(1)+"\tAddress:"+rs.getString(2));
}

co = 0;
do {
co++;
if( co > 1) 
System.out.println("invalid name... please enter again");
System.out.println("\nEnter the username whom you want to delete:");
nam=s.nextLine();



//String update="select * from "+ table +" where name='"+nam +"'";
rs=sta.executeQuery("select * from "+ table +" where name='"+nam +"'");

}while(!rs.next());


String delete="delete from "+table+" where name='"+nam+"'";
int delete_count=sta.executeUpdate(delete);
System.out.println("No of rows delete:"+delete_count);
rs=sta.executeQuery("select * from "+table);
while(rs.next())
{
System.out.println("\nName:"+rs.getString(1)+"\tAddress:"+rs.getString(2));
}
sta.close();
con.close();
}
catch(Exception e)
{
	System.err.println("Exception:"+e.getMessage());
}
}
}
