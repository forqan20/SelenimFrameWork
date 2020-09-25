package Test_1;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporterTestNG {
	 ExtentHtmlReporter htmlReporter;
	 ExtentReports extent;
WebDriver driver;
	@BeforeSuite
	public void setUp() {
		  // start reporters
         htmlReporter = new ExtentHtmlReporter("extent.html");
        // create ExtentReports and attach reporter(s)
         extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
	}
	
	@Before
	public  void BeforeTest() {
		System.setProperty("webdriver.gecko.driver", "C:\\workspace2\\MavenSeleniumFramework\\Driver\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	}
	@Test
	public void test1() throws Exception {
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        // log(Status, details)
        driver.get("https://www.google.com/");
        test.pass("navagate to google ");
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
}


	@AfterTest
	public void tearDown1() {
		
		driver.close();
		driver.quit();
		System.out.println("this test complete succesfull");
		
	}
	
	@AfterSuite 
	
	public void tearDown() {
		// calling flush writes everything to the log file
        extent.flush();
	}
	
	}
	
	
