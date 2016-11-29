import java.rmi.*;

public class Client {
  public static void main(String[] args) {

    RemoteHomeMonitor service = null;

    try {
      service = (RemoteHomeMonitor) Naming.lookup("rmi://127.0.0.1/RemoteHomeMonitor");

      service.turnOnAll();
      service.awayModeAll();
      service.getTemperatureSystemState();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}