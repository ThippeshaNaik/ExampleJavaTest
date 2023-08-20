package SeleniumJava2;

import java.io.File;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class EnabledDisabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("D://crx file//SelectorsHub 4.7.9.0.crx"));
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
//		System.out.println(driver.findElement(By.cssSelector("div[id='Div1']")).isEnabled());
//		driver.findElement(By.cssSelector("input#ctl00_mainContent_rbtnl_Trip_1")).click();
//		System.out.println(driver.findElement(By.cssSelector("div[id='Div1']")).isEnabled());
		
		System.out.println(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style"));
		driver.findElement(By.cssSelector("input#ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style"));
		
		if(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style").contains("1"))
		{
			System.out.println("enabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("disabled");
			Assert.assertFalse(false);
		}
			
		

	}

}
