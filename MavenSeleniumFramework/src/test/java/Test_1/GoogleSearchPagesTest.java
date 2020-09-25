package Test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Pages.GoogleSearchPages;

public class GoogleSearchPagesTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		GoogleSearch();
	}

	public static void GoogleSearch() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\workspace2\\MavenSeleniumFramework\\Driver\\Firefoxdriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("Automation test ");
		
		GoogleSearchPages.textbox_search(driver).sendKeys("Automation test");
		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		GoogleSearchPages.button_search(driver).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("this test complete succesfull");
		
	}

}
