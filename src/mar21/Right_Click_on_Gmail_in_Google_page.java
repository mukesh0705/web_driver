package mar21;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Right_Click_on_Gmail_in_Google_page {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(500);
		Actions krt=new Actions(driver);
		Thread.sleep(500);
		//right click on Gmail link
		krt.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
		Thread.sleep(1000);
		//create a object for robot class performing window related action
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		//Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		//Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		ArrayList<String> cr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(cr.get(1));
		krt.moveToElement(driver.findElement(By.linkText("Sign in"))).click().perform();
		//Thread.sleep(5000);
		driver.switchTo().window(cr.get(0));
		krt.moveToElement(driver.findElement(By.linkText("Images"))).click().perform();
		//Thread.sleep(5000);
		krt.moveToElement(driver.findElement(By.xpath("//a[@aria-label='Google apps']//*[name()='svg']"))).click().perform();
		//Thread.sleep(5000);
		List<WebElement> All_Frames=driver.findElements(By.tagName("iframe"));
		System.out.println(All_Frames.size());
		driver.switchTo().frame(1);
		Thread.sleep(500);
		krt.moveToElement(driver.findElement(By.linkText("YouTube"))).click().perform();
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(cr.get(1));
	    krt.moveToElement(driver.findElement(By.name("identifier"))).sendKeys("mkcoolmukesh123");
	    Thread.sleep(10000);
		driver.quit();
		
		
		


	}

}
