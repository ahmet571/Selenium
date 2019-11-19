package test;

 

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo {
	WebDriver driver =null;
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
	 	WebDriverManager.chromedriver().version("2.36").setup();
		driver = new ChromeDriver();
	}
@Test
	public   void googleSearch() {
		
	// goto google.com
		driver.get("https://googel.com");
		
	//	driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	//	driver.findElement(By.id("fakebox-text")).sendKeys("Automation Step by Step");
		
	//	driver.findElement(By.className("btnk")).sendKeys(Keys.RETURN);
		}
@AfterTest
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test Completed Succesfully");
	
	}
}
