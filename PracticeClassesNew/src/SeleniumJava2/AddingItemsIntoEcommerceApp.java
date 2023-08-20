package SeleniumJava2;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddingItemsIntoEcommerceApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File(".//Extentions//SelectorsHub 4.7.9.0.crx"));
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    
	    String productNames[] = {"Capsicum","Brinjal","Brocolli","Tomato","Onion","Apple","Grapes","Mango","Musk Melon"};
	    List<String> products =Arrays.asList(productNames);
	    //System.out.println(products);
	    
	    List <WebElement> itemNames = driver.findElements(By.cssSelector("h4.product-name"));
	    //System.out.println(itemNames.get(10).getText());
	    
	    for(int i=0;i<itemNames.size();i++)
	    {
	    	String itemName = itemNames.get(i).getText();
	    	String items[] = itemName.split("-");
	    	String item = items[0].trim();
	    	
	    	if(products.contains(item))
	    	{
	    		int j; j=0;
	    		driver.findElements(By.cssSelector("div.product-action button[type='button']")).get(i).click();
	    		System.out.println(item);
	    		if(j==productNames.length)
	    			break;
	    	}
	    }

	
	}

}
