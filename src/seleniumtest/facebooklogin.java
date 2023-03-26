package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		//Enter the email address 
		WebElement email = driver.findElement(By.name("email"));
		
		email.sendKeys("abc@gmail.com");
		
		//Enter Password address 
		WebElement Pass = driver.findElement(By.name("pass"));
		
		Pass.sendKeys("Akku@1234");
		
		//Click on Login 
		
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();


	}

}
