package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String expected_title="google";
		String actual_title=driver.getTitle();
		if(expected_title.equalsIgnoreCase(actual_title))
		{
			System.out.println("Title is matching::"+expected_title+" "+actual_title);
		}
		else
		{
			System.out.println("Title is not matching::"+expected_title+" "+actual_title);
		}
		driver.quit();
	}

}
