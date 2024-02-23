import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class invBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Defining WebDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinru\\Documents\\Drivers\\chrome\\chromedriver.exe");
		WebDriver mydriver = new ChromeDriver();
		
		//implicit time out wait of 5 seconds for browser to respond with errors for example.
		
		mydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //globally applicable to to all browser actions.
		//mydriver.get("https://cnn.com");
		//mydriver.getTitle();
		//System.out.println(mydriver.getTitle());
		mydriver.get("https://rahulshettyacademy.com/locatorspractice/");
		//<input type="text" placeholder="Username" id="inputUsername" value="">
		mydriver.findElement(By.id("inputUsername")).sendKeys("vinrush");
		//<input type="password" placeholder="Password" name="inputPassword" value="">
		mydriver.findElement(By.name("inputPassword")).sendKeys("abc123");
		//<button class="submit signInBtn" type="submit">Sign In</button>
		mydriver.findElement(By.className("submit")).click();
		//<p class="error">* Incorrect username or password </p>
		mydriver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(mydriver.findElement(By.cssSelector("p.error")).getText());
		
		//LinkText - <a tag is an anchor tag
		//forgot password is a link - use LinkText
		//<a href="#">Forgot your password?</a>
		mydriver.findElement(By.linkText("Forgot your password?")).click();
		
		//below added to avoid clicking on wrong button at the end of code.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//XPATH - Syntax - //Tagname[@attribute='value']
		//<input type="text" placeholder="Name" xpath="1"> - xpath will be //input[@placeholder='Name']
		mydriver.findElement(By.xpath("//input[@placeholder='Name']" )).sendKeys("Vinod Malatkar");
		//<input type="text" placeholder="Email" xpath="1">
		mydriver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("lakhan@gmail.com");
		//find by xpath using index
		mydriver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890");
		//mydriver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567891");
		//<button class="reset-pwd-btn" xpath="1">Reset Login</button> -  //--- //form/div/button[2]
		//mydriver.findElement(By.xpath("//form/div/button[2]")).click();
		mydriver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(mydriver.findElement(By.cssSelector("form p")).getText());
		mydriver.findElement(By.xpath("//form/div/button[1]")).click();
		//<input type="text" placeholder="Username" id="<input type="text" placeholder="Username" id="inputUsername" value="">" value="">
		mydriver.findElement(By.id("inputUsername")).sendKeys("Vinod");
		//<input type="password" placeholder="Password" name="inputPassword" value="">
		mydriver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		//<input type="checkbox" id="chkboxOne" name="chkboxOne" value="rmbrUsername" xpath="1">
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mydriver.findElement(By.name("chkboxOne")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mydriver.findElement(By.name("chkboxTwo")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mydriver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		mydriver.findElement(By.xpath("//button[contains(@class,'logout-btn')]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		mydriver.close();
	}

}
