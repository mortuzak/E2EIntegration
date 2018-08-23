package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {

	@Test
	public void testcase1 ()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/Mortuza/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String currentWindow = driver.getWindowHandle();
		driver.switchTo().window(currentWindow);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("whosyourdaddy");
		driver.findElement(By.id("pass")).sendKeys("whosyourmommy");
		driver.quit();
		
	}
	
}
