//import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		//In Selenium there is class to handle static dropdowns called Select. You will have to create an object of that first. 
		//It accepts/returns webelemnt as an argument.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinru\\Documents\\Drivers\\chrome\\chromedriver.exe");
		WebDriver mydriver = new ChromeDriver();
		mydriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//here we are trying to automate selection of static drop down.
		//Inspect the drop down first to make sure there is a select tag.
		//<select name="ctl00$mainContent$DropDownListCurrency" id="ctl00_mainContent_DropDownListCurrency" class="valid">
		//<option value="">Select</option>
		//<option value="INR">INR</option>
		//<option value="AED">AED</option>
		//<option value="USD">USD</option>
		//	</select>
		
		//first define a variable of type WebElement and provide the address by locator identified by ID in this case as below.
		WebElement mystaticDD = mydriver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		//Now create your new Select object to use the methods for selection of static drop down options
		Select mydropdown = new Select(mystaticDD);
		//Now perform operations on your Select object
		 mydropdown.selectByIndex(3);
		 System.out.println(mydropdown.getFirstSelectedOption().getText());
		 Thread.sleep(1000);
		 mydropdown.selectByVisibleText("AED");
		 System.out.println(mydropdown.getFirstSelectedOption().getText());
		 Thread.sleep(1000);
		 mydropdown.selectByValue("INR");
		 System.out.println(mydropdown.getFirstSelectedOption().getText());
		 mydriver.close();
		
	}

}
