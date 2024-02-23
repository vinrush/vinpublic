import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class dynDD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinru\\Documents\\Drivers\\chrome\\chromedriver.exe");
		WebDriver mydriver = new ChromeDriver();
		mydriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 mydriver.manage().window().maximize();
		//input type is autosuggest.
		//<input type="text" id="autosuggest" class="inputs ui-autocomplete-input" placeholder="Type to Select" autocomplete="off" xpath="1">
		/*
		 * mydriver.findElement(By.id("autosuggest")).sendKeys("br");
		 * Thread.sleep(2000);
		 * 
		 * 
		 * //li[class*='ui-menu-item'] a - css selector of auto suggestion generic
		 * locator.
		 * 
		 * List<WebElement> myoptions =
		 * mydriver.findElements(By.cssSelector("li[class*='ui-menu-item'] a")); for
		 * (WebElement option :myoptions) { if
		 * (option.getText().equalsIgnoreCase("Gibraltar")) { option.click(); break; }
		 * 
		 * }
		 * 
		 */	Thread.sleep(3000);
		// xpath for Delhi - //a[@value='DEL'] - from 
		
		// xpath for Hyd drop down - (//a[@value='HYD'])[2] destination
		
		//mydriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 
		// mydriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		 mydriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		mydriver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		mydriver.findElement(By.xpath("(//a[@text='Bhopal (BHO)'])[2]")).click();
		
		//mydriver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		//mydriver.findElement(By.xpath("//li[contains(@class,'city_selected')]//a[@value='HYD'][normalize-space()='Hyderabad (HYD)']")).click();
		//
		
	
		
		
	}

}
