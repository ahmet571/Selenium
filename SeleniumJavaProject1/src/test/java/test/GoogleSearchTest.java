package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.GoogleSearchPage;


//FIX IT 




public class GoogleSearchTest {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
		
	}
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
	//	WebDriverManager.chromedriver().version("2.36").setup();
	
		driver = new ChromeDriver();
		driver.get("https://google.com");
		
		//driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step by Step");
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
		//GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		driver.close();
		System.out.println("Test Completed Succesfully");
	}
}
