package SeleniumJava2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class ChrckBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File(".//Extentions//SelectorsHub 4.7.9.0.crx"));
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		boolean result1 =  driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected();
		driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).click();
		boolean result2 =  driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected();

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	
		

		
	}
}
