import java.rmi.*;

public class HomeMonitorTestDrive {
  public static void main(String[] args) {
    try {

      HomeMonitor myHomeMonitor = new HomeMonitor();

      Naming.rebind("RemoteHomeMonitor", myHomeMonitor);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

/***************************OUTPUT*****************************

Home Alarm System is On.
Home Lights System is On.
Home Temperature Control System is On.

**************************************************************/
