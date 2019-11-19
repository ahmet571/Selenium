package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 

public class TestNGParalelTesting {

	WebDriver driver=null;
	
	@Test
	public void test1() throws Exception{
		System.out.println("Test 1 |"+Thread.currentThread().getId());
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
	 //	WebDriverManager.chromedriver().version("2.36").setup();
		driver = new ChromeDriver();
		driver.get("https://googel.com");
		Thread.sleep(3000);
		driver.close();
		
	}
	@Test
	public void test2() throws Exception{
		System.out.println("Test 2 |"+Thread.currentThread().getId());
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
	 //	WebDriverManager.chromedriver().version("2.36").setup();
		driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(3000);
		driver.close();
	}
}
