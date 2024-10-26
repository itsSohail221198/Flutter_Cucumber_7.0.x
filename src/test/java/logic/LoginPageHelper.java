package logic;

import cucumber.api.java.en.*;
import framework.CommonMethods;
import framework.CreateSession;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginPageHelper {

    CommonMethods commonMethods;
    LoginPage loginPage;
    WebDriver driver;
    String url;
    String csvFilePath;
    FileWriter writer;
    File file;
    PrintWriter pw;

    public LoginPageHelper() throws IOException, InterruptedException {
        driver = CreateSession.getWebDriver();
        loginPage = new LoginPage(driver);
        csvFilePath = ".//src//test//java//outputFiles//searchResults.csv";
    }

    @Given("^Launch the Url in the chrome browser$")
    public void launch_url_browser() throws Throwable {
        loginPage.get("www.google-images.com");
        Thread.sleep(5000);
    }

    @When("^Enter the email \"([^\"]*)\" in the email field$")
    public void enter_email_loginPage(String emailValue) throws Throwable {
        commonMethods.scrollIntoViewUsingJs(loginPage.emailIdField);
        loginPage.findElement(loginPage.emailIdField).sendKeys(emailValue);
        Thread.sleep(3000);
    }

    @When("^Enter the password \"([^\"]*)\" in the password field$")
    public void enter_password_loginPage(String pwdValue) throws Throwable {
        commonMethods.scrollIntoViewUsingJs(loginPage.passWordField);
        loginPage.findElement(loginPage.passWordField).sendKeys(pwdValue);
        Thread.sleep(3000);
    }

    @Then("^Click the Login Button in the Login screen$")
    public void click_login_button_loginPage() throws Throwable {
        commonMethods.scrollIntoViewUsingJs(loginPage.emailIdField);
        loginPage.findElement(loginPage.loginBtn).click();
        Thread.sleep(3000);
    }

}
