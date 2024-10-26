package framework;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import logger.Log;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


/**
 * This class contains wedriver creation and quitting methods. These are required while
 * running each and every scenario. Methods are defined under @Before and @After hooks
 * to get initialized at start and end of the test.
 * @author shanky
 *
 */
public class CreateSession {

	private static WebDriver driver;
	@Before
	public static WebDriver createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gs1-sohaila\\Desktop\\UAM-Automation-FrameWork\\Flutter_Cucumber_7.0.x\\libs\\chromedriver.exe");

		// Set ChromeOptions for headless mode
		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true); // Run Chrome in headless mode
		options.addArguments("--disable-gpu"); // Disable GPU (recommended for headless)
		options.addArguments("--window-size=1920,1080"); // Set window size if needed

		// Initialize ChromeDriver with options
		driver = new ChromeDriver(options);
		return driver;
    }

	/**
	 * @return the webdriver for the current thread
	 */
	public static WebDriver getWebDriver() throws InterruptedException {
		driver.get("www.google.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
        return driver;
    }

	/**
	 * method executes at the end of each scenario and takes screenshot in case of scenario failure.
	 * Also, quit the webdriver
	 * @param scenario to verify if scenarios has passed or failed
	 */
	@After
	public void teardown(Scenario scenario) throws InterruptedException {

		// Here will compare if test is failing then only it will enter into if condition

		if(scenario.isFailed())
		{
			try 
			{
				// Create reference of TakesScreenshot
				TakesScreenshot ts=(TakesScreenshot) getWebDriver();

				// Call method to capture screenshot
				File source=ts.getScreenshotAs(OutputType.FILE);

				FileUtils.copyFile(source, new File(".//src//test//java//outputFiles//"+ "FailScreenshot" + 
						new SimpleDateFormat("MM-dd-yyyy-HH-mm-ss")
						.format(new GregorianCalendar().getTime())
						+ ".png"));
				Log.info("Automation Scenario failed and screenshot saved in outputFiles folder");
			} 
			catch (Exception e)
			{
				Log.info("Exception while taking screenshot "+e.getMessage());
			}
		}



		Log.info("Shutting down driver" + "\n" + "----------------------------------------------");
		System.out.println("\n");
		// quitting the webdriver
		getWebDriver().quit();
	}



}
