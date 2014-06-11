import java.rmi.*;
import java.util.*;
import java.io.*;

public class chatclient {
	public static void main(String [] args) throws Exception {
		try {
			System.out.println("enter ur nme:");
			Scanner s = new Scanner(System.in);
			String url = "rmi://" + args[0] + "/chatserver";			
			String n;
			n = s.nextLine();
			chatintf client = new chatimpl(n);
			chatintf server = (chatintf) Naming.lookup(url);
			String msg = n + "connected";
			server.send(msg);
			server.setClient(client);
			while(true) {
				msg = s.nextLine();	
				msg = " [ " + client.getName() + " ] " + msg;
				server.send(msg);
			}
			} catch(Exception e) { }
	}
}