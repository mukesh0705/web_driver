package mar21;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_mouse {

	public static void main(String[] args) throws Throwable {
		WebDriver kumar =new ChromeDriver();
		kumar.manage().window().maximize();
		kumar.manage().deleteAllCookies();
		kumar.get("https://flipkart.com");
		Thread.sleep(5000);
		Actions ktr=new Actions(kumar);
		ktr.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(5000);
		ktr.moveToElement(kumar.findElement(By.xpath("//div[contains(text(),'Fashion')]"))).perform();
		Thread.sleep(5000);
		ktr.moveToElement(kumar.findElement(By.xpath("//a[normalize-space()='All']"))).click().perform();
		Thread.sleep(5000);
		ktr.moveToElement(kumar.findElement(By.xpath("//span[.='Electronics']"))).perform();
		Thread.sleep(5000);
		ktr.moveToElement(kumar.findElement(By.xpath("//a[normalize-space()='Asus']"))).click().perform();
		Thread.sleep(5000);
		kumar.close();

	}

}
