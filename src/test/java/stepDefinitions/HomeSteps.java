package stepDefinitions;

import framework.CommonMethods;
import io.cucumber.java.en.*;
import pages.HomePage;

public class HomeSteps extends CommonMethods {
    HomePage homePage;
    CommonMethods commonMethods = new CommonMethods();
    public HomeSteps(){
        homePage = new HomePage(commonMethods.driver);
    }

    @Then("^Verify whether the Logout button is visible in the UI$")
    public void verifyLogoutBtnInUI(){
       String title = getTitle();
        System.out.println("Title of the page is "+title);
    }

    @Then("^Click the Logout button$")
    public void clickLogoutBtn(){
        clickElement(homePage.getLogOutBtn());
    }

}
