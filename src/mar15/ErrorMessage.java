package mar15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMessage {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("Admin42");
		String user=username.getAttribute("value");
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		String pass=password.getAttribute("value");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		System.out.println(user+"  "+pass);
		Thread.sleep(5000);
		String Expected="dashboard";
		String Actual=driver.getCurrentUrl();
		if(Actual.contains(Expected))
		{
			System.out.println("Login success::"+Expected+"  "+Actual);
		}
		else
		{
		String ErrorMsg=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		System.out.println(ErrorMsg+"   "+Expected+"   "+Actual);
		}
		driver.close();

	}

}
