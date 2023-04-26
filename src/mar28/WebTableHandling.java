package mar28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) throws Throwable {
		//write a script to print specified row and column data in a table
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//print specific row data
		String celldata1=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[7]/td[1]")).getText();
		String celldata2=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[7]/td[2]")).getText();
		System.out.println(celldata1+"   "+celldata2);
		driver.quit();
		

	}

}
