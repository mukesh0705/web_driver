package mar10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
   
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://classes.nareshit.com/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[3]/a[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Email or Phone']")).clear();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Email or Phone']")).sendKeys("8507720705");
		driver.findElement(By.name("password")).sendKeys("c4a133");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='LOG IN']")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
