import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrouwserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath= System.getProperty("user.dir");
		System.out.println("projectPath: "+projectPath);
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
 	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
	//	WebDriver driver = new ChromeDriver();
 	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
 	
 	System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		
		driver.get("https://www.seleniumhq.org/");
	//	driver.get("//https://www.google.com");
		try {
			
				Thread.sleep(3000);
				
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
