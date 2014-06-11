public class exceptions
{
	public static void main(String args[])
	{
		int array[]=new int[3];
		try
		{
			for(int i=0;i<4;i++)
				array[i]=i;
			for(int i=0;i<4;i++)
			{
				System.out.print(array[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Beyond array size");
		}
	}
}