package co.ahmet.selenium.webdriver.basic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;


public class launchbrowser {

	public static WebDriver driver=null;
	
	
	public launchbrowser() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		
		System.out.println("Title MATCH");
 	 
		// TODO Auto-generated method stub
		System.setProperty("chromedriver.exe","C:\\EclipseWS2\\Project1\\src\\driver\\chromedriver.exe");
//		C:\EclipseWS2\Project1\src\driver
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// open the web app
		driver.navigate().to("https://amazon.in");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("Amazon.in"))
			System.out.println("Title MATCH");
		else
			System.out.println("Title="+title);
 	 
	}

} 
