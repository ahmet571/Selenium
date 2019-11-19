package co.ahmet.selenium.webdriver.basic2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {
 

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("chromedriver.exe","C:\\Users\\ahmet\\Downloads\\chromedriver_win32\\chromedriver.exe");
//			C:\EclipseWS2\Project1\src\driver
			ChromeDriver driver = new ChromeDriver();
			
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

