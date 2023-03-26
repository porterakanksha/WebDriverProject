package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		
		
		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		
		//How to handle the window alerts
		WebElement alertbutton = driver.findElement(By.id("alertButton"));
		alertbutton.click();
		Alert obj = driver.switchTo().alert();
		Thread.sleep(3000);
		obj.accept();
		
		WebElement alertbutton1 = driver.findElement(By.id("confirmButton"));
		alertbutton.click();
		Alert obj1 = driver.switchTo().alert();
		Thread.sleep(3000);
		obj.dismiss();
		
		
	}

}
