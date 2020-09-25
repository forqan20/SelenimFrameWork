import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.sun.tools.javac.util.List;
public class seleniumFramework {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		//Thread.sleep(3000);
		//System.out.println("this is fiefoxdriver");
		//driver.close();
		//WebDriver driver1= new ChromeDriver();
		//Thread.sleep(3000);
		//System.out.println("this is chrome driver");
		//driver.close();
		//WebDriver driver = new InternetExplorerDriver();
		//System.out.println("this is internetExplore");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("//input[@name='q']");
		//WebElement textBox = driver.findElement(By.xpath("//input[@name='q']"));
	//textBox.sendKeys("Assadullah")
	java.util.List<WebElement> listOfInputElements =  driver.findElements(By.xpath("//input"));
	int count = listOfInputElements.size();
	System.out.println("count of input elements :"+count);
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		

	}

}
