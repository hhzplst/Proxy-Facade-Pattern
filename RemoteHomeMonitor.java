import java.rmi.*;
 
public interface RemoteHomeMonitor extends Remote {
  public void turnOffAll() throws RemoteException;
  public void turnOnAll() throws RemoteException;
  public String getAlarmSystemState() throws RemoteException;
  public String getLightsSystemState() throws RemoteException;
  public String getTemperatureSystemState() throws RemoteException;
  public void dayModeAll() throws RemoteException;
  public void nightModeAll() throws RemoteException;
  public void awayModeAll() throws RemoteException;
}