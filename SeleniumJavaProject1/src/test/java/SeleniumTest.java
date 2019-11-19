import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().version("2.36").setup();
		WebDriver driver = new ChromeDriver();
		
	//	WebDriverManager.firefoxdriver().setup();
		
		//WebDriver driver=get("https://google.com");
		
	//	WebDriver driver = new FirefoxDriver();
		 driver.get("https://google.com");
	//	WebElement textBox =driver.findElement(By.id("fakebox-input"));
	//	 WebElement textBox =driver.findElement(By.className("q"));
		 WebElement textBox =driver.findElement(By.name("q"));
		 textBox.sendKeys("ALAADDIN");
		// driver.findElement(By.className("btnK")).click();
	 	 driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
		//textBox.click();
		 try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	driver.close();
	//	driver.quit();
	}

}
