package mar25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Condition {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tickets.paytm.com/bus/");
		Thread.sleep(5000);
		//WebElement element=driver.findElement(By.xpath("//span[@class='tabsCircle appendRight5']"));
		List<WebElement> All_radio=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("No. of checkboxes are::"+"   "+All_radio.size());
		for (WebElement each : All_radio) {
			boolean store=each.isSelected();
			String value=each.getAttribute("id");
			System.out.println(value+"    \t"+store);
		}
		WebElement element=driver.findElement(By.xpath("//label[@for='roundTrip']"));
		boolean tfr=element.isSelected();
		System.out.println(tfr);
		element.click();
		Thread.sleep(5000);
		driver.quit();		

	}

}
