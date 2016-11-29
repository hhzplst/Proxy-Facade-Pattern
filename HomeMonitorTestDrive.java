import java.rmi.*;

public class HomeMonitorTestDrive {
  public static void main(String[] args) {
    HomeMonitor myHomeMonitor = new HomeMonitor();
    try {
      Naming.rebind("RemoteHomeMonitor", myHomeMonitor);
    } catch (Exception ex) {
      e.printStackTrace();
    }
  }
}