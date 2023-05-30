package tiktok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeanData_Test {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		for (int i = 0; i <=4; i++) {
		driver.get("http://data-pm.com/index.html#");
		Actions ktr=new Actions(driver);
		ktr.moveToElement(driver.findElement(By.xpath("(//a[@href='#'][normalize-space()='Services'])[1]"))).perform();
		Thread.sleep(2000);
		ktr.moveToElement(driver.findElement(By.xpath("(//a[@href='software-testing.html'][normalize-space()='Software-testing'])[1]"))).click().perform();
		Thread.sleep(5000);
		System.out.println("Testing success");
		
		}
		driver.close();
	}

}
