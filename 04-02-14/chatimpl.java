import java.rmi.*;
import java.rmi.server.*;
public class chatimpl extends UnicastRemoteObject implements chatintf
{
	public String name;
	public chatintf client=null;
	public chatimpl(String n) throws RemoteException
	{
		this.name=n;
	}
	public String getName() throws RemoteException
	{
		return this.name;
	}
	public void setClient(chatintf c)
	{
		client=c;
	}
	public chatintf getClient()
	{	
		return client;
	}
	public void send(String s) throws RemoteException
	{
		System.out.println(s);
	}
}