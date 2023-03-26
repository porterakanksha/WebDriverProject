package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		WebElement signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signup.click();
		Thread.sleep(3000);
		WebElement firstname1 = driver.findElement(By.xpath("//input[@aria-label='First name']"));
		firstname1.sendKeys("Akku");
		
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("sing");
		
		
		WebElement mobile  = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobile.sendKeys("9111519060");
		
		
		WebElement Pass  = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		Pass.sendKeys("Akku@1234");
		
		
		WebElement sign  = driver.findElement(By.name("websubmit"));
		sign.click();
		
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select ddDay = new Select(day);
		ddDay.selectByVisibleText("10");
		//ddDay.selectByValue("10");
		
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select ddMonth = new Select(Month);
		ddMonth.selectByVisibleText("Jan");
		
		WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select ddYear = new Select(Year);
		ddYear.selectByVisibleText("2000");


		
		
	}

}
