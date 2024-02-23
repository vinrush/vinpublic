//import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class travP2C {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinru\\Documents\\Drivers\\chrome\\chromedriver.exe");
		WebDriver mydriver = new ChromeDriver();
		mydriver.get("https://rahulshettyacademy.com/AutomationPractice/");
		////header/div/button[1]/following-sibling::button[2]
	System.out.println(mydriver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());

	}

}
