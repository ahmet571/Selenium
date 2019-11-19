package PhantomJS;

import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath= System.getProperty("user.dir");
		System.out.println("projectPath: "+projectPath);
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		System.setProperty("phantomjs.binary.path", projectPath+"/drivers/phantomjs/phantomjs.exe");
		
	//	System.setProperty("phantomjs.binary.path" , "C:\\EclipseWS2\\SeleniumJavaProject1\\drivers\\phantomjs\\phantomjs.exe");
		PhantomJSDriver  driver = new PhantomJSDriver();
		driver.get("http://seleniumhq.org/");
		System.out.println("Title ="+driver.getTitle());
		
	}

}
