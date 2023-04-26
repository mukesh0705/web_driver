package mar15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMessage1 {

	public static void main(String[] args) throws Throwable {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		WebElement username=dr.findElement(By.xpath("//input[@id='txtuId']"));
		username.clear();
		username.sendKeys("Admi1");
		String user=username.getAttribute("value");
		WebElement password=dr.findElement(By.xpath("(//input[@id='txtPword'])[1]"));
		password.clear();
		password.sendKeys("Admin");
		String pass=password.getAttribute("value");
		dr.findElement(By.xpath("//input[@id='login']")).click();
		System.out.println(user+"   "+pass);
		Thread.sleep(5000);
		String Expected="adminflo";
		String Actual=dr.getCurrentUrl();
		if(Actual.contains(Expected))
		{
			System.out.println("login success::   "+Expected+"     "+Actual);
		}
		else
		{
			String msg=dr.findElement(By.xpath("//html")).getText();
			System.out.println(msg+Expected+"     "+Actual);
		}
		dr.close();

	}

}
