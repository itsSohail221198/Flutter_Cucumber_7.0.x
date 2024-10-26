package stepDefinitions;

import driverManager.DriverManagerFile;
import driverManager.DriverSafeThread;
import framework.CommonMethods;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps extends CommonMethods {
    LoginPage loginPage;
    CommonMethods commonMethods = new CommonMethods();

    public LoginSteps(){
        loginPage = new LoginPage(commonMethods.driver);
    }

    @Given("^Launch the \"([^\"]*)\" url in the browser$")
    public void launch_url(String url) {
        launchURL(url);
        seleniumWait(5);
    }

    @When("^Enter the \"([^\"]*)\" in the email field$")
    public void enter_the_email(String emailValue) {
        commonMethods.enterText(loginPage.getEmail(), emailValue);
    }

    @When("^Enter the \"([^\"]*)\" in the password field$")
    public void enter_the_password(String pwd) {
        commonMethods.enterText(loginPage.getPassWordField(), pwd);
    }

    @Then("^Click the login button in the login page$")
    public void click_the_login_button() {
        commonMethods.clickElement(loginPage.getLoginButton());
    }

}
