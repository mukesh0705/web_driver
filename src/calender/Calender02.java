package calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender02 {

	public static void main(String[] args) throws Throwable {
		//Script to Select DateOfFly in Flights App using : sendKeys()
		//-------------------------------------------------------------------------------------
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://flights.qedgetech.com/");
				driver.findElement(By.name("email")).sendKeys("mukesh123@gmail.com");
				driver.findElement(By.name("password")).sendKeys("8507720705");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				driver.findElement(By.id("search-date")).sendKeys("8/15/2024");	
				Thread.sleep(5000);
				driver.close();

	}

}
