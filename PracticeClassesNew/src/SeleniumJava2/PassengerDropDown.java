package SeleniumJava2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class PassengerDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File(".//Extentions//SelectorsHub 4.7.9.0.crx"));
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText(), "1 Adult");
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ad-row'][1]/div[2]/span[3]")).click();
		driver.findElement(By.xpath("//div[@class='ad-row'][1]/div[2]/span[3]")).click();
		driver.findElement(By.xpath("//div[@class='ad-row'][1]/div[2]/span[3]")).click();
		driver.findElement(By.xpath("//div[@class='ad-row'][1]/div[2]/span[3]")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText());
		

	}

}
