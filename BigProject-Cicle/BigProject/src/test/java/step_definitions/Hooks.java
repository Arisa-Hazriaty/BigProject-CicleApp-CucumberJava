package step_definitions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	    public static WebDriver driver;

	    @Before
	    /**
	     * Delete all cookies at the start of each scenario to avoid
	     * shared state between tests
	     */
	    public void openBrowser() throws MalformedURLException {
	    	
	    	ChromeOptions chromeOptions = new ChromeOptions();
	    	
			
			chromeOptions.addArguments("--enable-sync");
			//chromeOptions.addArguments("--disable-extensions");
			chromeOptions.addArguments("--disable-popup-blocking");
			chromeOptions.addArguments("--profile-directory=Profile 4");
			chromeOptions.addArguments("--ignore-certificate-errors");
			chromeOptions.addArguments("--disable-plugins-discovery");
			chromeOptions.addArguments("user_agent=DN");
			chromeOptions.addArguments("user-data-dir=/Users/arisahazriaty/Library/Application Support/Google/Chrome/");

	    	System.setProperty("webdriver.chrome.driver", "/Users/arisahazriaty/Web Driver/chromedriver");
	    	
	    	driver = new ChromeDriver(chromeOptions);
	    	driver.manage().deleteAllCookies();
	    	driver.manage().window().maximize();
			driver.get("https://staging.cicle.app/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    }

	 
	    
	  @After
	    /**
	     * Embed a screenshot in test report if test is marked as failed
	     */
	  public void closeBrowser(Scenario scenario) {
			
			if (scenario.isFailed()) {
				try {
	                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	                scenario.embed(screenshot, "image/png");
	            } catch (WebDriverException noSupportScreenshot) {
	                System.err.println(noSupportScreenshot.getMessage());
	            }
			}
			driver.quit();
		}

}


