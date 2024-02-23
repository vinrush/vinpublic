import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class getPasswd {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinru\\Documents\\Drivers\\chrome\\chromedriver.exe");
		WebDriver mydriver = new ChromeDriver();
		mydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //globally applicable to to all browser actions.
		mydriver.get("https://rahulshettyacademy.com/locatorspractice/");
		mydriver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
