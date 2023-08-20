package SeleniumJava2;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndTestingFlightTicketBooking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File(".//Extentions//SelectorsHub 4.7.9.0.crx"));
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.cssSelector("input#autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> names = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		for(int i=0;i<names.size();i++)
		{
			String name = driver.findElements(By.cssSelector("li[class='ui-menu-item']")).get(i).getText();
			if(name.equalsIgnoreCase("India"))
			{
				names.get(i).click();
				break;
			}
		}
		driver.findElement(By.cssSelector("li[class='book_flight']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#ctl00_mainContent_rbtnl_Trip_0")).click();
		System.out.println(driver.findElement(By.cssSelector("div#Div1")).getAttribute("style"));
		if(driver.findElement(By.cssSelector("div#Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("disabled");
		    Assert.assertTrue(true);
		}
		
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[text='Bengaluru (BLR)']")).click();
		driver.findElement(By.cssSelector("div#ctl00_mainContent_ddl_destinationStation1_CTNR div table tbody a[text='Hubli (HBX)']")).click();
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#divpaxinfo")).getText());
		driver.findElement(By.cssSelector("div#divpaxinfo")).click();
		Thread.sleep(2000);
		int i=1;
		while(i<5)
		{
			driver.findElement(By.cssSelector("div#divpaxOptions div span[id='hrefIncAdt']")).click();
			i++;
		}
		driver.findElement(By.cssSelector("input#btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.cssSelector("div#divpaxinfo")).getText());
		
		WebElement staticdrop = driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));
		Select obj = new Select(staticdrop);
		//obj.selectByIndex(3);
		obj.selectByValue("AED");
		//obj.selectByVisibleText("IND");
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//		driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_IndArm")).click();
//		driver.findElement(By.cssSelector("input#ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		
		

	}

}
