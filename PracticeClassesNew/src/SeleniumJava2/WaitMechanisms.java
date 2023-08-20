package SeleniumJava2;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMechanisms {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File(".//Extentions//SelectorsHub 4.7.9.0.crx"));
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
//		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='_37M3Pb'] div[class='eFQ30H']:nth-child(4) path[class='_1zrN4q']")));
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("div[class='_37M3Pb'] div[class='eFQ30H']:nth-child(4) path[class='_1zrN4q']"))).build().perform();
		//driver.findElement(By.cssSelector("div[class='_37M3Pb'] div[class='eFQ30H']:nth-child(4) path[class='_1zrN4q']")).
		driver.findElement(By.cssSelector("div[class='_3XS_gI _7qr1OC'] a[class='_6WOcW9 _2-k99T']")).click();
		driver.findElement(By.xpath("//div[@class='_3YgSsQ']/div/a/div[text()='Mobile Chargers']")).click();
		
		
		
	}

}
