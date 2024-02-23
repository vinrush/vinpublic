import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
public class dropDown2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinru\\Documents\\Drivers\\chrome\\chromedriver.exe");
		WebDriver mydriver = new ChromeDriver();
		
		//In this class, we are working on passengers drop down where we have to add 3 Adults and click on Done in selection
		//https://rahulshettyacademy.com/dropdownsPractise/ -> Passengers -> add 3 Adults and click Done
		
		mydriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//<input id="ctl00_mainContent_chk_IndArm" type="checkbox" name="ctl00$mainContent$chk_IndArm" xpath="1"> //clicking check box
		mydriver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		System.out.println(mydriver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		
		Thread.sleep(2000);
		//Inspect WebElement that opens the dropdown "Passengers"
		//<div id="divpaxinfo" class="paxinfo">1 Adult</div>
		mydriver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(5000);
		//goal is to select 4 adults. 1 is selected by default.
		//If you inspect the webelement preset "+", it has below info
		//<span class="pax-add pax-enabled" id="hrefIncAdt">+</span>
		//we can use id and do 3 clicks.
		//mydriver.findElement(By.id("hrefIncAdt")).click();
	
		for(int i=0;i<3;i++) {
			mydriver.findElement(By.id("hrefIncAdt")).click();
		}
		//now click on done to chose 5 adults.
		//<input class="buttonN" id="btnclosepaxoption" value="Done" type="button" xpath="1">
		Thread.sleep(3000);
		mydriver.findElement(By.id("btnclosepaxoption")).click();
		
		Thread.sleep(3000);
	mydriver.close();
	}

}
