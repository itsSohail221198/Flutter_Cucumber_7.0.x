package pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.CommonMethods;
public class LoginPage extends CommonMethods{
    public LoginPage(WebDriver driver) throws IOException {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public By emailIdField = By.xpath("//input[@aria-label='Email *']");
    public By passWordField = By.xpath("(//input[@aria-label='Password *'])");
    public By viewPasswordBtn = By.xpath("(//flt-semantics[@id='flt-semantic-node-10'])");
    public By loginBtn = By.xpath("(//flt-semantics[@aria-label='semanticsLoginBTN'])");

}
