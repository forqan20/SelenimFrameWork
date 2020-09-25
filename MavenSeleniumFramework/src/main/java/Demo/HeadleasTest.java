package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadleasTest {

	public static void main(String[] args) {
		test();
	}
	 public static void test() {
		 System.setProperty("webdriver.gecko.driver","C:\\workspace2\\MavenSeleniumFramework\\Driver\\Firefoxdriver\\geckodriver.exe");
		 FirefoxOptions options = new FirefoxOptions();
		 options.addArguments("--headless");
		 WebDriver driver = new FirefoxDriver(options);
		 driver.get("https://www.google.com/");
		 System.out.println(driver.getTitle());
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation");
		 driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		 driver.close();
		 driver.quit();
		 System.out.println("this is completed ");
	 }

}
