import java.net.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.rmi.*;
import java.util.*;
import java.io.*;


public class chatserver
{
        public static void main(String args[])
        {
                try
                {
                        Scanner s = new Scanner(System.in);
                        System.out.println("Enter your name");
                        String n = s.nextLine();
                        chatimpl chat = new chatimpl(n);
                        Naming.rebind("chatserver",chat);
                        while(true)
                        {
                                String msg = s.nextLine();
                                if(chat.getClient() != null)
                                {
                                        chatintf client = chat.getClient();
                                        msg="["+chat.getName()+"]"+msg;
                                        client.send(msg);
                                }
                        }
                }catch(ConnectionException e) { }
                catch(Exception e)
                {
                        System.out.println("Exception "+e);
                }
        }
}

