package framework;

import driverManager.DriverManagerFile;
import driverManager.DriverSafeThread;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class CommonMethods {
    public WebDriver driver;
    public CommonMethods(){
        DriverManagerFile.initDriver();
        WebDriver driver = DriverSafeThread.getDriver();
        this.driver = driver;
        System.out.println("common methods driver "+driver);
    }

    public void launchURL(String url){
        System.out.println("<-------- Launching URL in the Chrome Browser -------->");
        driver.get(url);
    }
    public void seleniumWait(int waitTimeInSec) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTimeInSec));
    }
    public void clickElement(WebElement element) {
        element.click();
    }
    public void enterText(WebElement element, String text) {
        element.sendKeys(text);
    }
    public void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }
    public void jsScrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void waitForPageLoad() {
    }
    public String getTitle(){
        return driver.getTitle();
    }

}
