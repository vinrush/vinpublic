//import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class browserActivity {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinru\\Documents\\Drivers\\chrome\\chromedriver.exe");
		WebDriver mydriver = new ChromeDriver();
		//You can Mange your driver object by using a method called manage in WebDriver
		mydriver.manage().window().maximize();
		mydriver.get("https://google.com");
		mydriver.navigate().to("https://amazon.com");
		Thread.sleep(2000);
		mydriver.navigate().back();
		Thread.sleep(2000);
		mydriver.navigate().forward();
		Thread.sleep(1000);
		mydriver.manage().window().minimize();
		Thread.sleep(2000);
		mydriver.close();
		}

}
