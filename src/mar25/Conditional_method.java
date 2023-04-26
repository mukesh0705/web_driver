package mar25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_method {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(5000);
		//verify first name text box is enabled or not
		WebElement firstname=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		boolean value=firstname.isEnabled();
		System.out.println(value);
		//verify re-enter email text box is displayed or not
		WebElement element=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		boolean value1=element.isDisplayed();
		System.out.println(value1);
		//verify radio button is selected or not
		WebElement radiobutton=driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		boolean value2=radiobutton.isSelected();
		System.out.println(value2);
		driver.quit();
		
		

	}

}
