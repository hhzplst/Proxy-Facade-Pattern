import java.rmi.*;

public class Client {
  public static void main(String[] args) {

    RemoteHomeMonitor service = null;

    try {
      service = (RemoteHomeMonitor) Naming.lookup("RemoteHomeMonitor");

      service.turnOnAll();
      service.awayModeAll();
      System.out.println(service.getTemperatureSystemState());

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

/***************************OUTPUT*****************************

Home Temperature control is in away mode.

**************************************************************/