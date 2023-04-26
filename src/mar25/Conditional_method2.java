package mar25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_method2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		WebElement element=driver.findElement(By.xpath("//input[@id='remember']"));
		boolean value=element.isSelected();
		System.out.println(value);
		element.click();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
