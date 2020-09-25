package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchObjectPages {
	
	WebDriver driver = null;
	
	By textbox_search = By.name("q");
	By Button_search = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");
	
	public GoogleSearchObjectPages(WebDriver driver){
	this.driver = driver;
	}
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}

	public void clickSearchButton() {
		driver.findElement(Button_search).sendKeys(Keys.RETURN);
	}
}
