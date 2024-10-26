package driverManager;
import org.openqa.selenium.WebDriver;
public class DriverSafeThread {
    private  static final ThreadLocal<WebDriver>driverThreadLocal=new ThreadLocal<>();

    public static WebDriver getDriver(){
        return driverThreadLocal.get();
    }

    public static  void setDriver(WebDriver driverRef)
    {
        driverThreadLocal.set(driverRef);
    }

    public  static void unload(){
        driverThreadLocal.remove();
    }
}
