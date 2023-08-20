package SeleniumJava2;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Day001Sub {

	private static Object Asserts;

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ADMIN\\\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File(".//Extentions//SelectorsHub 4.7.9.0.crx"));
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//send username and password
		
		driver.findElement(By.id("inputUsername")).sendKeys("Thippesha");
		driver.findElement(By.name("inputPassword")).sendKeys("naiklambani");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		//forget password
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder=\"Name\"]")).sendKeys("Thippeshanaik");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("Thippeshanaik2011");
		driver.findElement(By.cssSelector("input[placeholder=\"Phone Number\"]")).sendKeys("9164738754");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		String passtext[] = driver.findElement(By.cssSelector("p.infoMsg")).getText().split("'");
		String password = passtext[0];
		String password1 = passtext[1];
		System.out.println(password);
		System.out.println(password1);
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		//username and password after reset
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("Thippesha");
		driver.findElement(By.name("inputPassword")).sendKeys(password1);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		Thread.sleep(2000);
		String homepage = driver.findElement(By.xpath("//div[@class=\"login-container\"]/p")).getText();
		System.out.println(homepage);
		driver.findElement(By.cssSelector("button.logout-btn")).click();
	
	
		
	    
	}

}
