package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsBasicDemo {

	private static WebDriver driver =null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// path where output is to be printed
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("ExtentReports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1 = extent.createTest("GoogleSearch test 1");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
	//	WebDriverManager.chromedriver().version("2.36").setup();
	
		driver = new ChromeDriver();
		test1.log(Status.INFO, "Starting Test Case");
		
		driver.get("https://google.com");
		test1.pass("Naviagted to google.com");
	//	driver.findElement(By.name("q")).sendKeys("Automation");
	//	driver.findElement(By.id("fakebox-input")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		test1.pass("Entered text in SearchBox");	
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Pressed keyboard enter key");
		driver.close();
		driver.quit();
		test1.pass("Closed the browser");
		test1.info("Test Completed");
		extent.flush();
		System.out.println("Test Completed Succesfully");
		
		ExtentTest test2 = extent.createTest("GoogleSearch test 1");
	//	String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
	//	WebDriverManager.chromedriver().version("2.36").setup();
	
		driver = new ChromeDriver();
		test2.log(Status.INFO, "Starting Test Case");
		
		driver.get("https://google.com");
		test2.pass("Naviagted to google.com");
	//	driver.findElement(By.name("q")).sendKeys("Automation");
	//	driver.findElement(By.id("fakebox-input")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		test2.pass("Entered text in SearchBox");	
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test2.pass("Pressed keyboard enter key");
		driver.close();
		driver.quit();
		test2.fail("Closed the browser");
		test2.info("Test Completed");
		extent.flush();
		System.out.println("Test Completed Succesfully");
		
		
	}

}
