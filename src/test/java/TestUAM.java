import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class TestUAM {

    //GCI Admin flow
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\gs1-sohaila\\Desktop\\Selenium_BDD\\selenium_BDD_framework\\libs\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("http://127.0.0.1:9091/uam");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Enter email field
        driver.findElement(By.xpath("(//input[@aria-label='Email *'])")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@aria-label='Email *'])"))
                .sendKeys("cone@gmail.com");

        Thread.sleep(3000);
        //Click Logo
        driver.findElement(By.xpath("//flt-semantics[@id='flt-semantic-node-26']")).click();

        Thread.sleep(3000);
        //Enter password field
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//input[@aria-label='Password *']")));
        driver.findElement(By.xpath("//input[@aria-label='Password *']")).sendKeys("TestTest1$");

        Thread.sleep(3000);
        //Click viewPassword Button
        driver.findElement(By.xpath("(//flt-semantics[@id='flt-semantic-node-10'])"))
                .click();

        Thread.sleep(3000);
        //Click login Button
        driver.findElement(By.xpath("(//flt-semantics[@aria-label='semanticsLoginBTN'])"))
                .click();
        Thread.sleep(5000);
        System.out.println("Login Page is Automated");

        //Click Sidebar -- Manage SP Details Screen
/*        driver.findElement(By.xpath("//flt-semantics[@id='flt-semantic-node-67']"))
                .click();

        Thread.sleep(3000);*/

        //Click SideBar -- Manage Shipment

/*        WebElement manageShipment = driver.findElement(By.xpath("//flt-semantics[@id='flt-semantic-node-38']"));
        js.executeScript("arguments[0].scrollIntoView(true);", manageShipment);
        js.executeScript("arguments[0].click();", manageShipment);
        System.out.println("Clicked MainMenu");
        Thread.sleep(5000);

        //Click SideBar -- Available
        WebElement availableSideBar = driver.findElement(By.xpath("//flt-semantics[@id='flt-semantic-node-40']"));
        js.executeScript("arguments[0].scrollIntoView(true);", availableSideBar);
        js.executeScript("arguments[0].click();", availableSideBar);
        System.out.println("Clicked Available");
        Thread.sleep(5000);

        //Click SideBar -- Acknowledged
        WebElement acknowledgedSideBar = driver.findElement(By.xpath("//flt-semantics[@id='flt-semantic-node-41']"));
        js.executeScript("arguments[0].scrollIntoView(true);", acknowledgedSideBar);
        js.executeScript("arguments[0].click();", acknowledgedSideBar);
        System.out.println("Clicked Acknowledged");

        Thread.sleep(5000);

        //Click SideBar -- Accepted
        WebElement acceptedSideBar = driver.findElement(By.xpath("//flt-semantics[@id='flt-semantic-node-42']"));
        js.executeScript("arguments[0].scrollIntoView(true);", acceptedSideBar);
        js.executeScript("arguments[0].click();",acceptedSideBar);
        System.out.println("Clicked Accepted");

        Thread.sleep(5000);

        //Click SideBar -- Declined
        WebElement declinedSideBar = driver.findElement(By.xpath("//flt-semantics[@id='flt-semantic-node-43']"));
        js.executeScript("arguments[0].scrollIntoView(true);", declinedSideBar);
        js.executeScript("arguments[0].click();", declinedSideBar);
        System.out.println("Clicked Declined");

        Thread.sleep(5000);

        //Click SideBar -- InTransit
        WebElement inTransitSideBar = driver.findElement(By.xpath("//flt-semantics[@id='flt-semantic-node-44']"));
        js.executeScript("arguments[0].scrollIntoView(true);", inTransitSideBar);
        js.executeScript("arguments[0].click();", inTransitSideBar);
        System.out.println("Clicked InTransit");

        Thread.sleep(5000);

        //Click SideBar -- Delivered
        WebElement deliveredSideBar = driver.findElement(By.xpath("//flt-semantics[@id='flt-semantic-node-45']"));
        js.executeScript("arguments[0].scrollIntoView(true);", deliveredSideBar);
        js.executeScript("arguments[0].click();", deliveredSideBar);
        System.out.println("Clicked Delivered");

        Thread.sleep(5000);

        //Click SideBar -- Collapse
        WebElement collapseSideBar = driver.findElement(By.xpath("//flt-semantics[@id='flt-semantic-node-28']"));
        js.executeScript("arguments[0].scrollIntoView(true);", collapseSideBar);
        js.executeScript("arguments[0].click();", collapseSideBar);
        System.out.println("Clicked Collapse");

        Thread.sleep(5000);*/

        //Click Manage SP Details
/*        WebElement manageSPDetails = driver.findElement(By.xpath("//flt-semantics[@id='flt-semantic-node-36']"));
        js.executeScript("arguments[0].scrollIntoView(true);", manageSPDetails);
        js.executeScript("arguments[0].click();", manageSPDetails);
        System.out.println("Clicked Manage SP Details");

        System.out.println("Click Add SP Admin Functionality Starting .........!!!!!");

        WebElement viewMoreSpAdmin = driver.findElement(By.xpath("//flt-semantics[@id='flt-semantic-node-84']"));
        js.executeScript("arguments[0].scrollIntoView(true);", viewMoreSpAdmin);
        js.executeScript("arguments[0].click();", viewMoreSpAdmin);
        System.out.println("Clicked View More SP Admin");
        Thread.sleep(5000);

        WebElement viewLessSpAdmin = driver.findElement(By.xpath("//flt-semantics[@aria-label='View more GCI Admin Service Provider Admin']"));
        js.executeScript("arguments[0].scrollIntoView(true);", viewLessSpAdmin);
        js.executeScript("arguments[0].click();", viewLessSpAdmin);
        System.out.println("Clicked View Less SP Admin");
        Thread.sleep(5000);

        WebElement addSpAdmin = driver.findElement(By.xpath("//flt-semantics[@id='flt-semantic-node-85']"));
        js.executeScript("arguments[0].scrollIntoView(true);", addSpAdmin);
        js.executeScript("arguments[0].click();", addSpAdmin);
        System.out.println("Clicked Add SP Admin");
        Thread.sleep(5000);

        WebElement enterNamePopup = driver.findElement(By.xpath("//input[@aria-label='Enter name']"));
        js.executeScript("arguments[0].scrollIntoView(true);", enterNamePopup);
        enterNamePopup.sendKeys("SohailTest");
        System.out.println("Entered Name");
        Thread.sleep(3000);

        WebElement enterEmailPopup1 = driver.findElement(By.xpath("//input[@aria-label='Enter email']"));
        WebElement enterEmailPopup2 = driver.findElement(By.xpath("//input[@aria-label='Enter email']"));
        js.executeScript("arguments[0].scrollIntoView(true);", enterEmailPopup2);
        enterEmailPopup2.sendKeys("SohailTest@gmail.com");
        System.out.println("Entered Email");
        Thread.sleep(3000);

        WebElement addAdminBtnPopup = driver.findElement(By.xpath("//flt-semantics[@aria-label='Add Admin']"));
        js.executeScript("arguments[0].scrollIntoView(true);", addAdminBtnPopup);
        js.executeScript("arguments[0].click();", addAdminBtnPopup);
        System.out.println("Clicked Add Admin");
        Thread.sleep(3000);

        WebElement savePopup = driver.findElement(By.xpath("//flt-semantics[@aria-label='Save']"));
        WebElement cancelPopup = driver.findElement(By.xpath("//flt-semantics[@aria-label='Cancel']"));
        WebElement deleteIconPopup = driver.findElement(By.xpath("//flt-semantics[@aria-label='Delete']"));
        //WebElement okCancelPopup = driver.findElement(By.xpath("//flt-semantics[@aria-label='Ok']"));
        System.out.println("Came Here!!!!");

        WebElement closePopup = driver.findElement(By.xpath("//flt-semantics[@tabindex='0']"));
        js.executeScript("arguments[0].scrollIntoView(true);", closePopup);
        js.executeScript("arguments[0].click();", closePopup);
        System.out.println("Clicked Close Popup button");
        Thread.sleep(3000);*/

/*        js.executeScript("arguments[0].scrollIntoView(true);", cancelPopup);
        js.executeScript("arguments[0].click();", cancelPopup);
        System.out.println("Clicked Cancel");
        Thread.sleep(3000);*/

        /*WebElement okCancelPopup = driver.findElement(By.xpath("//flt-semantics[@aria-label='Ok']"));
        js.executeScript("arguments[0].scrollIntoView(true);", okCancelPopup);
        js.executeScript("arguments[0].click();", okCancelPopup);
        System.out.println("Clicked Confirmation");
        driver.navigate().refresh();
        Thread.sleep(6000);*/

/*
        js.executeScript("arguments[0].scrollIntoView(true);", deleteIconPopup);
        js.executeScript("arguments[0].click();", deleteIconPopup);
        System.out.println("Clicked Delete Icon");
        Thread.sleep(3000);

        WebElement confirmPopup = driver.findElement(By.xpath("//flt-semantics[@aria-label='Confirm']"));
        js.executeScript("arguments[0].scrollIntoView(true);", confirmPopup);
        js.executeScript("arguments[0].click();", confirmPopup);
        System.out.println("Clicked Confirm Popup button");
        Thread.sleep(3000);

        System.out.println("Testing Cancel Delete option....!!!!!");
*//*        js.executeScript("arguments[0].scrollIntoView(true);", enterNamePopup);*//*
        enterNamePopup.sendKeys("SohailTester");
        System.out.println("Entered Name Again");
        Thread.sleep(3000);
//        js.executeScript("arguments[0].scrollIntoView(true);", enterEmailPopup2);
        enterEmailPopup2.sendKeys("SohailTest123@gmail.com");
        System.out.println("Entered Email Again");
        Thread.sleep(3000);
//        js.executeScript("arguments[0].scrollIntoView(true);", addAdminBtnPopup);
        js.executeScript("arguments[0].click();", addAdminBtnPopup);
        System.out.println("Clicked Add Admin Again");
        Thread.sleep(5000);
//        js.executeScript("arguments[0].scrollIntoView(true);", deleteIconPopup);
        js.executeScript("arguments[0].click();", deleteIconPopup);
        System.out.println("Clicked Delete Icon Again");
        Thread.sleep(3000);
//        js.executeScript("arguments[0].scrollIntoView(true);", cancelPopup);
        js.executeScript("arguments[0].click();", cancelPopup);
        System.out.println("Clicked Cancel Popup button");
        Thread.sleep(3000);*/


/*        //Click SP User:
        WebElement spUser = driver.findElement(By.xpath("//flt-semantics[@id='flt-semantic-node-87']"));
        js.executeScript("arguments[0].scrollIntoView(true);", spUser);
        js.executeScript("arguments[0].click();", spAdmin);
        System.out.println("Clicked SPUser");
        Thread.sleep(5000);

        //Click m2m config:
        WebElement m2mConfig = driver.findElement(By.xpath("//flt-semantics[@id='flt-semantic-node-89']"));
        js.executeScript("arguments[0].scrollIntoView(true);", m2mConfig);
        js.executeScript("arguments[0].click();", spAdmin);
        System.out.println("Clicked m2mConfig");
        Thread.sleep(5000);*/

/*

        WebElement emailSemantics = driver.findElement(By.xpath("//flt-semantics[@aria-label='semanticsEmailTextBox']"));
        WebElement passWordSemantics = driver.findElement(By.xpath("//flt-semantics[@aria-label='semanticsPasswordTextBox']"));
        WebElement loginBtnSemantics = driver.findElement(By.xpath("//flt-semantics[@aria-label='semanticsLoginBTN']"));

        emailSemantics.click();
        Thread.sleep(3000);
        emailSemantics.sendKeys("uamgciuserdev@gmail.com");
        Thread.sleep(3000);

        js.executeScript("arguments[0].scrollIntoView(true);", passWordSemantics);
        Thread.sleep(3000);
        passWordSemantics.sendKeys("TestTest1$");
        Thread.sleep(3000);

        loginBtnSemantics.click();
        Thread.sleep(10000);
*/


//<<<<<<< -------- WORK ORDER FLOW -----------  >>>>>>>>//

        WebElement acknowledgedSideBar = driver.findElement(By.xpath("//flt-semantics[@aria-label='sidebar-Acknowledged']"));
        WebElement availableSideBar = driver.findElement(By.xpath("//flt-semantics[@aria-label='sidebar-Available']"));
        WebElement acceptedSideBar = driver.findElement(By.xpath("//flt-semantics[@aria-label='sidebar-Accepted']"));
        WebElement declinedSideBar = driver.findElement(By.xpath("//flt-semantics[@aria-label='sidebar-Declined']"));
        WebElement inTransitSideBar = driver.findElement(By.xpath("//flt-semantics[@aria-label='sidebar-InTransit']"));
        WebElement deliveredSideBar = driver.findElement(By.xpath("//flt-semantics[@aria-label='sidebar-Delivered']"));


/*        js.executeScript("arguments[0].scrollIntoView(true);", acknowledgedSideBar);
        js.executeScript("arguments[0].click();", acknowledgedSideBar);
        System.out.println("Clicked Acknowledged SideBar");
        Thread.sleep(2000);*/

/*        js.executeScript("arguments[0].scrollIntoView(true);", availableSideBar);
        js.executeScript("arguments[0].click();", availableSideBar);
        System.out.println("Clicked Available SideBar");
        Thread.sleep(5000);*/

        js.executeScript("arguments[0].scrollIntoView(true);", acceptedSideBar);
        js.executeScript("arguments[0].click();", acceptedSideBar);
        System.out.println("Clicked Accepted SideBar");
        Thread.sleep(5000);

/*        js.executeScript("arguments[0].scrollIntoView(true);", declinedSideBar);
        js.executeScript("arguments[0].click();", declinedSideBar);
        System.out.println("Clicked Declined SideBar");
        Thread.sleep(5000);

        js.executeScript("arguments[0].scrollIntoView(true);", inTransitSideBar);
        js.executeScript("arguments[0].click();", inTransitSideBar);
        System.out.println("Clicked InTransit SideBar");
        Thread.sleep(5000);

        js.executeScript("arguments[0].scrollIntoView(true);", deliveredSideBar);
        js.executeScript("arguments[0].click();", deliveredSideBar);
        System.out.println("Clicked Delivered SideBar");
        Thread.sleep(5000);*/

        //view more icon list screen
        WebElement viewMoreIcon = driver.findElement(By.xpath("(//flt-semantics[@aria-label='view-more-icon'])[3]"));

/*        js.executeScript("arguments[0].scrollIntoView(true);", viewMoreIcon);
        js.executeScript("arguments[0].click();", viewMoreIcon);
        System.out.println("Clicked View More icon");
        Thread.sleep(5000);

        WebElement selectDropDown = driver.findElement(By.xpath("//flt-semantics[@aria-label='assignee-drop-down']"));
        WebElement acceptDetailsScreen = driver.findElement(By.xpath("//flt-semantics[@aria-label='Accept']"));
        WebElement declineDetailsScreen = driver.findElement(By.xpath("//flt-semantics[@aria-label='Decline']"));

        js.executeScript("arguments[0].scrollIntoView(true);", acceptDetailsScreen);
        js.executeScript("arguments[0].click();", acceptDetailsScreen);
        System.out.println("Clicked Decline WO button from Details screen");
        Thread.sleep(5000);*/

        //Multi Select WorkOrders from the list screen

/*        WebElement wo1 = driver.findElement(By.xpath("//flt-semantics[@aria-label='Expeditors-LAX'][2]"));
        WebElement wo2 = driver.findElement(By.xpath("//flt-semantics[@aria-label='Expeditors-LAX'][3]"));
        WebElement wo3 = driver.findElement(By.xpath("//flt-semantics[@aria-label='Expeditors-LAX'][4]"));

        js.executeScript("arguments[0].scrollIntoView(true);", wo1);
        js.executeScript("arguments[0].click();", wo1);
        System.out.println("Selected first WO");
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true);", wo2);
        js.executeScript("arguments[0].click();", wo2);
        System.out.println("Selected Second WO");
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true);", wo3);
        js.executeScript("arguments[0].click();", wo3);
        System.out.println("Selected Third WO");
        Thread.sleep(3000);

        WebElement acceptListScreen = driver.findElement(By.xpath("//flt-semantics[@aria-label='Accept']"));
        WebElement declineListScreen = driver.findElement(By.xpath("//flt-semantics[@aria-label='Decline']"));

        js.executeScript("arguments[0].scrollIntoView(true);", acceptListScreen);
        js.executeScript("arguments[0].click();", acceptListScreen);
        System.out.println("Accepted WOs from the list screen");
        Thread.sleep(5000);*/

        //Search WorkOrder from the list Screen

/*        WebElement searchTextBox = driver.findElement(By.xpath("//input[@aria-label='Search...']"));
        WebElement searchListScreen = driver.findElement(By.xpath("//flt-semantics[@aria-label='search-wo-list-screen']"));

        js.executeScript("arguments[0].scrollIntoView(true);", searchTextBox);
        searchTextBox.sendKeys("F07");
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true);", searchListScreen);
        js.executeScript("arguments[0].click();", searchListScreen);
        System.out.println("Searched WorkOrders from the List screen");
        Thread.sleep(5000);*/

        //Filter Option from the list screen -- Happy Path

/*        WebElement filterIconListScreen = driver.findElement(By.xpath("(//flt-semantics[@role='button' and @tabindex='0'])[1]"));


        js.executeScript("arguments[0].scrollIntoView(true);", filterIconListScreen);
        js.executeScript("arguments[0].click();", filterIconListScreen);
        System.out.println("Clicked Filter Icon from the list screen");
        Thread.sleep(3000);

        WebElement filterWOButton = driver.findElement(By.xpath("//flt-semantics[@aria-label='Filter']"));
        WebElement woNumberFilter = driver.findElement(By.xpath("//input[@aria-label='WO Number']"));
        WebElement assigneeFilter = driver.findElement(By.xpath("//input[@aria-label='Assignee']"));
        WebElement houseBillFilter = driver.findElement(By.xpath("//input[@aria-label='HouseBill number']"));
        WebElement portOriginFilter = driver.findElement(By.xpath("//input[@aria-label='Port origin']"));
        WebElement portDestinationFilter = driver.findElement(By.xpath("//input[@aria-label='Port Destination']"));

        js.executeScript("arguments[0].scrollIntoView(true);", woNumberFilter);
        woNumberFilter.sendKeys("LAX");
        Thread.sleep(3000);

        js.executeScript("arguments[0].scrollIntoView(true);", assigneeFilter);
        assigneeFilter.sendKeys("cone");
        Thread.sleep(3000);

        js.executeScript("arguments[0].scrollIntoView(true);", houseBillFilter);
        houseBillFilter.sendKeys("H");
        Thread.sleep(3000);

        js.executeScript("arguments[0].scrollIntoView(true);", portOriginFilter);
        portOriginFilter.sendKeys("LAX");
        Thread.sleep(3000);


        js.executeScript("arguments[0].scrollIntoView(true);", portDestinationFilter);
        portDestinationFilter.sendKeys("LRD");
        Thread.sleep(3000);

        js.executeScript("arguments[0].scrollIntoView(true);", filterWOButton);
        js.executeScript("arguments[0].click();", filterWOButton);
        System.out.println("Clicked Filter Button from list screen");
        Thread.sleep(3000);*/

        //Sort option from the List Screen

/*
        WebElement sortIconListScreen = driver.findElement(By.xpath("(//flt-semantics[@role='button' and @tabindex='0'])[2]"));

        js.executeScript("arguments[0].scrollIntoView(true);", sortIconListScreen);
        js.executeScript("arguments[0].click();", sortIconListScreen);
        System.out.println("Clicked Sort Icon from the list screen");
        Thread.sleep(3000);

        WebElement sortByAscending = driver.findElement(By.xpath("//flt-semantics[@aria-label='Sort by Ascending']"));
        WebElement sortByDescending = driver.findElement(By.xpath("//flt-semantics[@aria-label='Sort by Descending']"));

        js.executeScript("arguments[0].scrollIntoView(true);", sortByAscending);
        js.executeScript("arguments[0].click();", sortByAscending);
        System.out.println("Clicked Sort by Ascending option from the list screen");
        Thread.sleep(6000);
*/




        driver.quit();

    }
}
