import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
public class assTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinru\\Documents\\Drivers\\chrome\\chromedriver.exe");

		WebDriver mydriver = new ChromeDriver();

		mydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//System.out.println((getPassword(mydriver)));
		
		String password = getPassword(mydriver);
		
		mydriver.get("https://rahulshettyacademy.com/locatorspractice/");
		//<input type="text" placeholder="Username" id="inputUsername" value="">
		
		mydriver.findElement(By.id("inputUsername")).sendKeys("John");
		//<input type="password" placeholder="Password" name="inputPassword" value="">
		mydriver.findElement(By.name("inputPassword")).sendKeys(password);
		//<button class="submit signInBtn" type="submit">Sign In</button>
		mydriver.findElement(By.className("submit")).click();
		//mydriver.findElement(By.tagName("p")).getText();
		//System.out.println(mydriver.findElement(By.xpath("//div/p")).getText());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//System.out.println(mydriver.findElement(By.cssSelector("div[class='login-container'] p")).getText());
		//div[class='login-container'] p
		//Assert.assertEquals(mydriver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		//Assert.assertEquals(mydriver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	}
	
	public static String getPassword(WebDriver mydriver) throws InterruptedException {
		mydriver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(1000);
		mydriver.findElement(By.linkText("Forgot your password?")).click();
		//Please use temporary password 'rahulshettyacademy' to Login.
		Thread.sleep(2000);
		mydriver.findElement(By.xpath("//button[normalize-space()='Reset Login']")).click();
		String passwdText = mydriver.findElement(By.cssSelector(".infoMsg")).getText();
		String[] passwdArr = passwdText.split("'");
		String password = passwdArr[1].split("'")[0];
		return password;
		
	}
	
}


