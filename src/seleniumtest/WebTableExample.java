package seleniumtest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			// Maximize the browser
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
			
			List <WebElement> Rows  = driver.findElements(By.cssSelector("table#customers>tbody>tr"));
			System.out.println("Total no. of rows "+ Rows.size());
			
			List <WebElement> Columns  = driver.findElements(By.xpath("//table[@id ='customers']//th"));
			System.out.println("Total no. of rows "+ Columns.size());
			WebElement data1 = driver.findElement(By.xpath("//table[@id='customers']//tr[4]/td[1]"));
			 
			 System.out.println("The data is " +data1.getText());
			 
			 for(int i =2 ; i<=Rows.size(); i++)
			 {
				 List <WebElement> ColumnsDate  = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[\" + i + \"]/td"));
				System.out.println(ColumnsDate.get(0).getText() + " " +ColumnsDate.get(1).getText()+ " "+ ColumnsDate.get(2).getText() ); 
			 }
			 
		}
}
			 


