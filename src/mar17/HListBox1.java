package mar17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HListBox1 {

	public static void main(String[] args) throws Throwable  {
		// To get number of items present in a list box.
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		Select All_select =new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> Hello=All_select.getOptions();
		//print each and every items name
		System.out.println(Hello.size());
		for (WebElement each :Hello) {
			System.out.println(each.getText());
		}
		driver.close();  
		
	}

}
