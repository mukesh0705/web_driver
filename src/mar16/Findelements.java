package mar16;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		//get collection of links in a web page.
		List<WebElement> allLink=driver.findElements(By.tagName("a"));
		System.out.println(allLink.size());
		Thread.sleep(5000);
		//print each link text
		//W3C-World Wide Web Consortium
		for (WebElement each : allLink) {
			System.out.println(each.getText());
			System.out.println(each.getAttribute("href"));	
		}
		Thread.sleep(5000);
		driver.close();

	}

}
//W3C-World Wide Web Consortium