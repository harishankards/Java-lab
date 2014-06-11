import java.rmi.*;
import java.rmi.server.*;

public interface chatintf extends Remote {
        public String getName() throws RemoteException;
        public void send(String msg) throws RemoteException;
        public void setClient(chatintf c) throws RemoteException;
        public chatintf getClient() throws RemoteException;
}

