package SeleniumJava2;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CountryAutoSuggestedDropDown {	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File(".//Extentions//SelectorsHub 4.7.9.0.crx"));
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[class='inputs ui-autocomplete-input']")).sendKeys("bra");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(3000);
		List<WebElement> options2 = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option:options2)
		{
			if (option.getText().equalsIgnoreCase("Gibraltar"))
			{
				option.click();
				break;
			}
			
		}
		
		// Simple way to click particular link
		    //driver.get("https://bel-india.in/");
		    //driver.findElement(By.id("ctl00_ucheader_ainvestors")).click();
		    //Thread.sleep(5000);
		    //driver.findElement(By.linkText("Dividend")).click();
}
}

