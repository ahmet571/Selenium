import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
		
//		DesiredCapabilities caps =new DesiredCapabilities();
     	WebDriver driver= new InternetExplorerDriver();
	 			
	 			
	//	System.out.println("projectPath: "+projectPath);
	//	System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
		
	// 	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
	 //	WebDriver driver = new ChromeDriver();
		
		
	// 	WebDriver driver= new InternetExplorerDriver();
		
		driver.get("https://google.com");
		//driver.get("https://googel.com");
		WebElement textBox =driver.findElement(By.name("q"));
	//	WebElement textBox2 =driver.findElement(By.name("q"));
		textBox.sendKeys("ALAADDIN");
		// driver.findElement(By.className("btnK")).click();
		//	 driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	//	driver.findElement(By.className("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
		
	} 

}
