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