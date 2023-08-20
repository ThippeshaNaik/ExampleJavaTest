package SeleniumJava2;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderUI {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File(".//Extentions//SelectorsHub 4.7.9.0.crx"));
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']/div/table/tbody//a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']/div/table/tbody//a[@text='Varanasi (VNS)']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		
		//grab the common attributer and perform.
		List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
		int count = driver.findElements(By.className("ui-state-default")).size();
		
		for(int i=0;i<count;i++ )
		{
			
			String date = driver.findElements(By.className("ui-state-default")).get(i).getText();
		    if(date.equalsIgnoreCase("25"))
		    {
		    	driver.findElements(By.className("ui-state-default")).get(i).click();
		    	break;
		    }
		}
		
		//IRCTC web calender UI handling:
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.cssSelector("#jDate")).click();
		int i=0;
		while(i<3)
		{
			driver.findElement(By.cssSelector("a[class*='ui-datepicker-next'] span[class*='ui-datepicker-next-icon']")).click();
			i++;
		}
		
		List<WebElement> novm = driver.findElements(By.cssSelector("td[class='ng-tns-c58-10 ng-star-inserted']"));
        for(WebElement nov:novm)
        {
        	if(nov.getText().contains("15"))
        	{
        		nov.click();
        		break;
        	}
        	
        }
   
	}

}
