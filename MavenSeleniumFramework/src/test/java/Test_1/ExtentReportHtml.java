package Test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportHtml {
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test1 = extent.createTest("Google sesrch box");
		System.setProperty("webdriver.gecko.driver",
				"C:\\workspace2\\MavenSeleniumFramework\\Driver\\Firefoxdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		Thread.sleep(3000);

		test1.log(Status.INFO, "Starting test Case ");

		driver.get("https://www.google.com/");
		test1.pass("Navagated to google.com");

		driver.findElement(By.name("q")).sendKeys("Automation test");
		test1.pass("Entered text in Search box");

		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Pressed the kaybord enter key");
		driver.close();
		driver.quit();
		test1.pass("Closed the Browser and completed");

		extent.flush();

	}

}
