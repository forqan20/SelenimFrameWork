package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class TestNGMultiBrowserDemo {
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	
	public void setup(String browserName) {
		
		System.out.println("Browser name is : "+browserName);
		System.out.println("Thread id :"+Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.ie.driver", projectPath+"/Driver/EDIDriver/IEDriverServer.exe");
	    driver = new InternetExplorerDriver();
		
	}
	else if (browserName.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver", projectPath+"/Driver/Firefoxdriver/geckodriver.exe");
		 driver = new FirefoxDriver();

}
	else if(browserName.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.close();
		 System.out.println("This test is completed");
		 

		
		
		
	}
	}
	}

