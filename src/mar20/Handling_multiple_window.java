package mar20;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_multiple_window {

	public static void main(String[] args) throws Throwable {
		//Like Gmail most of web-application have multiple windows and multiple frames 
		//so now we learn how to Handle these multiple window.
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		//print gmail parent id
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		//click three links related to gmail 
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Privacy")).click();
		//get collection of all window
		Set<String> all_wins=driver.getWindowHandles();
		System.out.println(all_wins);
		//iterate all windows
		for (String each : all_wins) {
			//parent id should not be wqual to child id
			if (!parent.equals(each)) {
				//switch to each child window and print title
				String pagetitle=driver.switchTo().window(each).getTitle();
				Thread.sleep(5000);
				System.out.println(pagetitle);
				Thread.sleep(5000);
				driver.close();	
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("mkcoolmukesh123");
		Thread.sleep(5000);
		driver.quit();

	}

}
