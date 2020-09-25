package Demo;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  
	  String projectPath = System.getProperty("user.dir");
	  
	  System.setProperty("webdriver.gecko.driver", projectPath+"/Driver/Firefoxdriver/geckodriver.exe");
		 driver = new FirefoxDriver();

    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCase1() throws Exception {
    driver.get("https://www.expedia.com/?gclid=Cj0KCQjwnqH7BRDdARIsACTSAdvQaXbjTSjdnxHyTHDc9vF79-fLTsO8VciiOMJ_Br8pql259TyNatIaAt8cEALw_wcB&langid=1033&pwaLob=wizard-hotel-pwa-v2&semcid=US.B.GOOGLE.BT-c-EN.GENERIC&semdtl=a110156529180.b1100493252143.r1.g1kwd-12670071.i1.d1461696173901.e1c.j19022900.k1.f1.n1.l1g.h1e.m1");
    driver.findElement(By.xpath("//div[@id='gc-custom-header-nav-bar-acct-menu']/button/div")).click();
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.xpath("//input[@id='signin-loginid']")).sendKeys("a.asad2012@yahoo.com");
    driver.findElement(By.id("signin-password")).sendKeys("Forqan2016@");
    driver.findElement(By.id("submitButton")).click();
    driver.findElement(By.xpath("//div[@id='gc-custom-header-nav-bar-acct-menu']/button/div")).click();
    driver.findElement(By.linkText("Sign out")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
      
      driver.close();
    }
  }
}
