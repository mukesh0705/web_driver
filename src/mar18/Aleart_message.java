package mar18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aleart_message {

	public static void main(String[] args) throws Throwable {
		//Handle alert message in a web-page 
		//Alert message is not part of web-page,it's part of browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admi1");
		driver.findElement(By.name("login")).click();
		//Capture alert message 
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(5000);
		//click "ok" to alert windows 
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
	}

}
