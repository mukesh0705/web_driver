package mar18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HLboxPrint_selected_Items {

	public static void main(String[] args) throws Throwable {
		//Print selected Items on console in multi selection list box
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/MultiListboxHtmlpage.html");
		Thread.sleep(5000);
		Select dropdown=new Select(driver.findElement(By.name("multiSelection")));
		for(int i=0;i<=9;i++) {
			dropdown.selectByIndex(i);
		}
		//Get collection of items which are selected in list box
		List<WebElement> Selected_items=dropdown.getAllSelectedOptions();
		System.out.println("No. of selected items:: "+Selected_items.size());
		for (WebElement each : Selected_items) {
			Thread.sleep(5000);
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
