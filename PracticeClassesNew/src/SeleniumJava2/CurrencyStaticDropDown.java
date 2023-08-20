package SeleniumJava2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CurrencyStaticDropDown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "c://Users//ADMIN//chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addExtensions(new File(".//Extentions//SelectorsHub 4.7.9.0.crx"));
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//static drop down
	WebElement staticdrop = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
	Select dropdown = new Select(staticdrop);
	dropdown.selectByValue("USD");
	dropdown.selectByVisibleText("AED");
	dropdown.selectByIndex(3);
	
	

	}

}
