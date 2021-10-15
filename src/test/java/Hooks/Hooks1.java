package Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks1 {
	public static WebDriver driver;

	@Before
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\Capgemini\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://realty-real-estatem1.upskills.in/admin");
	}
	@After
	public void close() 
	{
		
		System.out.println("Closed");
		driver.quit();
	}
	}


