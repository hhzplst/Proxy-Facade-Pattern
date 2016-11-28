import java.rmi.*;
 
public interface RemoteHomeMonitor extends Remote {
  public void turnOffAll() throws RemoteException;
  public void turnOnAll() throws RemoteException;
  public State getState(System s) throws RemoteException;
  public void dayModeAll() throws RemoteException;
  public void nightModeAll() throws RemoteException;
  public void awayModeAll() throws RemoteException;
}