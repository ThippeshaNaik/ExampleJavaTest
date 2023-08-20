package SeleniumJava2;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Day001 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\ADMIN\\chromedriver.exe");
	    ChromeOptions option = new ChromeOptions();
	    option.addExtensions(new File(".//Extentions//SelectorsHub 4.7.9.0.crx"));
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Naik The Great"); //css customized syntax.
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12354"); //x-path customized syntax.
		driver.findElement(By.cssSelector("div[class='checkbox-container'] span:nth-child(1) input")).click(); //css customized parent to child with indexing
		driver.findElement(By.xpath("//div[@class='checkbox-container']/span[2]/input")).click(); //x-path customized parent to child with indexing
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); //regular expression x-path.
	    //forget password
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		
		
	
		
		
		
		
		
		
	}

}
