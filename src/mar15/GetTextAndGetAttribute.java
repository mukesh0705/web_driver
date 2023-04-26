package mar15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetAttribute {

	public static void main(String[] args) throws Throwable {
		//getText() method(web element method)It return visible text of an element in a web page.
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String Expected=driver.findElement(By.linkText("Gmail")).getText();
		String Actual="gmail";
		String getUrl=driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(getUrl);
		if(Expected.equalsIgnoreCase(Actual))
		{
			System.out.println("link found in a page::"+Expected+"   "+Actual);
		}
		else 
		{
			System.out.println("link not found in a page::"+Expected+"   "+Actual);
		}
		driver.close();

	}

}
