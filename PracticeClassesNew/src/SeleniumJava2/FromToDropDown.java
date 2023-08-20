package SeleniumJava2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FromToDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addExtensions(new File(".//Extentions//SelectorsHub 4.7.9.0.crx"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//ID locator Without Indexing. No error.
		    //driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		    //Thread.sleep(3000);s
		    //driver.findElement(By.linkText("Delhi (DEL)")).click();
		
		//X-path //a[@value='GOP']  1 matching element. only when 'From' options are opened.
		//X-path //a[@value='GOP']  2 matching element . when 'TO' option are opened.
		//In that case have to use index and the syntax will be (//a[@value='DEL'])[2] 1 element matching.
		
		//X-path With Indexing. Console:  ElementNotInteractableException.
		    //driver.findElement(By.xpath("//a[@value='BLR']")).click();
		    //Thread.sleep(2000);
		    //driver.findElement(By.xpath("//a[@value='DEL']")).click();
		
		//X-path with indexing.   No error.
		   //driver.findElement(By.xpath("//a[@value='BLR']")).click();
		   //Thread.sleep(2000);
		   //driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		//  //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']/table/tbody//a[@value='HYD']
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']/table/tbody//a[@value='HYD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']/table/tbody//a[@text='Kolkata (CCU)']")).click();

	}

}
