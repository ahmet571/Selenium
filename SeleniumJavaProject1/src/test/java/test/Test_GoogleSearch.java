package test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
		
	}
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriverManager.chromedriver().version("2.36").setup();
		WebDriver driver = new ChromeDriver();
 
	//	driver.findElement(By.id("fakebox-input")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		driver.findElement(By.className("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test Completed Succesfully");
	}
}
