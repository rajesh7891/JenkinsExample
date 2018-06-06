package testbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowseChrome {
	
	WebDriver driver;
	
	@BeforeTest
	public void setupbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Desktop\\Learning\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Opening Browser");
	}
	
	
	@Test
	public void chromeTest()
	{
		driver.get("https://www.facebook.com/");
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		System.out.println("Test Passed with the Page Title: "+driver.getTitle());		
	}
	
	@AfterTest
	public void tearup()
	{		
		System.out.println("Closing Browser");
		driver.close();
	}

}
