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

public class EndToEndTestingFlightTicketBooking02 {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//chromedriver.exe");
       ChromeOptions options = new ChromeOptions();
       options.addExtensions(new File(".//Extentions//SelectorsHub 4.7.9.0.crx"));
       options.addArguments("--disable-notifications");
       WebDriver driver = new ChromeDriver(options);
       driver.manage().window().maximize();
       driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("rus");
       List<WebElement> names = driver.findElements(By.cssSelector("li[role='presentation']"));
       //Enhanced for loop or for each loop:
           /*for(WebElement name:names)
             {
    	         String name1 = name.getText();
    	         if(name1.equalsIgnoreCase("Russian Federation"))
    	       {
    		      name.click();
    		      break;
    	       }
             }*/
       
       // for loop with equalsIgnoreCase() method
           /*for(int i=0;i<names.size();i++)
             {
        	   String name = names.get(i).getText();
        	   if(name.equalsIgnoreCase("Russian Federation"))
        	   {
        		   names.get(i).click();
        		   break;
        	   }
             }*/
      
       //for loop with contains() method
           for(int i=0;i<names.size();i++)
           {
        	   if(names.get(i).getText().contains("Russian Federation"))
        	   {
        		   names.get(i).click();
        		   break;
        	   }
        	   
           }
           
       driver.findElement(By.xpath("//li[@class='book_flight']//span[text()='Flights']")).click();
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
       //System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
       String attri = driver.findElement(By.cssSelector("#spclearDate")).getAttribute("style");
       System.out.println(attri);
       if(attri.contains("block"))
       {
    	   System.out.println("enabled");
    	   Assert.assertTrue(true);
       }
       else
       {
    	   System.out.println("disabled");
    	   Assert.assertFalse(false);
       }
       
       driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("#glsctl00_mainContent_ddl_originStation1_CTNR a[text='Bengaluru (BLR)']")).click();
       driver.findElement(By.cssSelector("#glsctl00_mainContent_ddl_destinationStation1_CTNR a[text='Leh (IXL)']")).click();
       List<WebElement> dates = driver.findElements(By.cssSelector("#ui-datepicker-div td[data-year='2023']"));
       for(WebElement date:dates)
       {
    	   if(date.getText().contains("20"))
    	   {
    		   date.click();
    		   break;
    	   }
       }
       
       driver.findElement(By.cssSelector("#Div1")).click();
       Thread.sleep(3000);
       List<WebElement> datess = driver.findElements(By.cssSelector("td[data-month='8']"));
       for(WebElement date1:datess)
       {
    	   if(date1.getText().contains("5"))
    	   {
    		   date1.click();
    		   break;
    	   }
       }

       driver.findElement(By.cssSelector("#divpaxinfo")).click();
       Thread.sleep(2000);
       int i=1;
       while(i<5) 
       {
    	   driver.findElement(By.cssSelector("#hrefIncAdt")).click();
    	   i++;
       }
      driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
           
       
       WebElement currency = driver.findElement(By.cssSelector("select[id='ctl00_mainContent_DropDownListCurrency']"));
       Select obj = new Select(currency);
       //obj.selectByVisibleText("AED");
       //obj.selectByValue("USD");
       obj.selectByIndex(3);
       
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).click();
       
       System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

     
	}

}
