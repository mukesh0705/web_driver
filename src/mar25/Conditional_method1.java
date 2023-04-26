package mar25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_method1 {

	public static void main(String[] args) throws Throwable {
		//write a script to get a collection of check boxes in a webpage.
		//verify which check box is true and which are false in the collection.
		//print each and every check box name,unchecked check box if already selected and checked if not selected.
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/checkbox_1.html");
		Thread.sleep(5000);
		//get collection of check boxes
		List<WebElement> All_checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("No. of checkboxes are:: "+All_checkboxes.size());
		Thread.sleep(5000);
		for (WebElement each : All_checkboxes) {
			//verify which check box are true and which are false
			boolean value=each.isSelected();
			//capture each check box name
			String checkBoxName=each.getAttribute("value");
			System.out.println(checkBoxName+"     \t"+value);
			Thread.sleep(500);
			each.click();
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
