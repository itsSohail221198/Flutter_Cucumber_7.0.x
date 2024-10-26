package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Objects;
public class DriverManagerFile {

    public static void initDriver() {
        if (Objects.isNull(DriverSafeThread.getDriver())) {
            System.out.println("*********** Initiating the Chrome Browser ***********");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\gs1-sohaila\\Desktop\\TestFolder_Selenium\\SelniumForUAM\\src\\test\\resources\\drivers\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
//            options.addArguments("headless");
            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            DriverSafeThread.setDriver(driver);
        }
    }

    public static void quitDriver() {

        if (Objects.isNull(DriverSafeThread.getDriver())) {
            System.out.println("*********** Browser is already closed ***********");
        } else if (Objects.nonNull(DriverSafeThread.getDriver())) {
            DriverSafeThread.getDriver().quit();
            System.out.println("*********** Closing the Driver ***********");
            DriverSafeThread.unload();
        }


    }
}
