package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebBrowserTest {
	 WebDriver driver;
	   @Test
	  public void Login() {
	        driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("Raman@yahoo.com");
			driver.findElement(By.id("Password")).sendKeys("pass123");
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		//	String expectedText="Raman@yahoo.com";
		//	String actualText=driver.findElement(By.linkText("Raman@yahoo.com")).getText();
		//	Assert.assertEquals(expectedText,actualText);
	  }
	  
	  @Test
	  public void Logout() throws InterruptedException {
		  Thread.sleep(3000);
		  driver.findElement(By.linkText("Log out"));
	  }
	 
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","C:\\Tejas Training\\chromedriver_win32 (2)\\chromedriver.exe");
			driver= new ChromeDriver();    //WebDriver is an interface.
			driver.get("http://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
}