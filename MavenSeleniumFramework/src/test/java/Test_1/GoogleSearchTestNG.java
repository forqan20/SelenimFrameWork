package Test_1;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GoogleSearchPages;

public class GoogleSearchTestNG {
	
	private static WebDriver driver = null;
	
	@BeforeTest
	public static void setUpTest() { 
		System.setProperty("webdriver.gecko.driver", "C:\\workspace2\\MavenSeleniumFramework\\Driver\\Firefoxdriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		 
	}
	@Test 
	public void GoogleSearch() {
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("Automation test ");
		
		GoogleSearchPages.textbox_search(driver).sendKeys("Automation test");
		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		GoogleSearchPages.button_search(driver).sendKeys(Keys.RETURN);
		
		
	}
	@AfterTest 
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("this test complete succesfull");
	}

}
