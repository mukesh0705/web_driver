package mar18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HLbox_itemFoun_OR_not {

	public static void main(String[] args) throws Throwable {
		// Validate expected items found in list box or not.
		//String Expected_item="Baby";
		String Expected_item="deals";
		boolean Item_exist=false;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> all_items=listbox.getOptions();
		for (WebElement each : all_items) {
			String Actual_items =each.getText();
			//Thread.sleep(1000);
			System.out.println(Actual_items);
			if (Actual_items.equalsIgnoreCase(Expected_item)) {
				Item_exist=true;
				break;
				}
		}
        //if item exist is true print items found or not
		if (Item_exist) {
			System.out.println("Item found in list box:: "+Expected_item);
		}
		else {
			System.out.println("Item not found in list box:: "+Expected_item);
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
