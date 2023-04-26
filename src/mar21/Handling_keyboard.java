package mar21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_keyboard {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://google.com");
		 Thread.sleep(5000);
		 Actions aws=new Actions(driver);
		 driver.findElement(By.name("q")).sendKeys("selenium opening");
		 Thread.sleep(5000);
		 aws.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(5000);
		 aws.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(5000);
		 aws.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(5000);
		 aws.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(5000);
		 aws.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(5000);
		 driver.quit();



	}

}
