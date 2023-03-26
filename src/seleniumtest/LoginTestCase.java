package seleniumtest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		//WebElement login = driver.findElement(By.linkText("Log in"));
		//login.click();
		
		System.out.println("The title of the page is " + driver.getTitle());
		Thread.sleep(3000);
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		String location = loginLink.getAttribute("href");
		System.out.println("The link will take you to " + location);
		loginLink.click();
		
		
		WebElement userName = driver.findElement(By.name("user_login"));
		userName.sendKeys("abc@xyz.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Abc@12345");
		
		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		RememberMe.click();

		
		WebElement loginBtn = driver.findElement(By.name("btn_login"));
		loginBtn.click();

		
		
		WebElement error = driver.findElement(By.className("error_msg"));
		String errorMsg = error.getText();
		String expErrorMsg = "The email or password you have entered is invalid.";
		
		if(error.isDisplayed() && errorMsg.equals(expErrorMsg)) {
			
			System.out.println("TC Passed");
		}else {
			
			System.out.println("TC Failed");
		}
		
		
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links are " + AllLinks.size());
		
		for(WebElement link : AllLinks) {
			
			System.out.println(link.getAttribute("href"));
		}
		



		driver.close();


		
		
	
	}

}
