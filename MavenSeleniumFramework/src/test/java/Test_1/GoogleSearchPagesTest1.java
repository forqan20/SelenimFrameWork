package Test_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.GoogleSearchObjectPages;


public class GoogleSearchPagesTest1 {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\workspace2\\MavenSeleniumFramework\\Driver\\Firefoxdriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 GoogleSearchObjectPages searchPagesObj = new GoogleSearchObjectPages(driver);
		 driver.get("https://www.google.com/");
		 searchPagesObj.setTextInSearchBox("A B C");
		 searchPagesObj.clickSearchButton();
		 driver.close();
		 System.out.println("this test complete successfully ");
		 

	}

}
