package mar18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HLbox_multiSelection {

	public static void main(String[] args) throws Throwable {
		//Multi-selection of items in a list box.
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/MultiListboxHtmlpage.html");
		Thread.sleep(5000);
		Select dropdown=new Select(driver.findElement(By.name("multiSelection")));
		//Verify listbox is multiselection or single selection
		boolean value=dropdown.isMultiple();
		System.out.println(value);
		//Select 0 to 7 items in listbox
		for (int i=0;i<=7;i++) {
			Thread.sleep(1000);
			dropdown.selectByIndex(i);
		}
		//Deselect all items which are selected
		for(int j=0;j<=7;j++) {
			Thread.sleep(1000);
			dropdown.deselectByIndex(j);
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
