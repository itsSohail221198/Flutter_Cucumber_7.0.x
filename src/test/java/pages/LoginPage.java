package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("username"));
    }
    public WebElement getPassWordField() {
        return driver.findElement(By.id("password"));
    }
    public WebElement getLoginButton() {
        return driver.findElement(By.id("submit"));
    }

}
