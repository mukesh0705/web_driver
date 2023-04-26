package mar16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().refresh();
		System.out.println("Navigation button validation successfull");
		Thread.sleep(5000);
		driver.close();
		

	}

}
