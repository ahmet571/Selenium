package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 

public class TestNGParalelTesting2 {

	WebDriver driver=null;
	
	@Test(threadPoolSize=3,invocationCount=3,timeOut=1000)
	public void test1() throws Exception{
		System.out.println("Test 1 |"+Thread.currentThread().getId());
	}
	@Test
	public void test2() throws Exception{
		System.out.println("Test 2 |"+Thread.currentThread().getId());
	}
	@Test
	public void test3() throws Exception{
		System.out.println("Test 3 |"+Thread.currentThread().getId());
	}
}
