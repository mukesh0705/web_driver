package mar28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling1 {

	public static void main(String[] args) throws Throwable {
		//write a script to get rows collection in a table and print each row-column size.
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement webTable=driver.findElement(By.className("dataTable"));
		//get collection of rows in web table
		List<WebElement> rows=webTable.findElements(By.tagName("tr"));
		int rowscoll=rows.size()-1;
		System.out.println("No. of rows::  "+rowscoll);
		Thread.sleep(5000);
		//iterate all rows
		for(int i=1;i<=rowscoll;i++) {
			//get column collection
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			Thread.sleep(500);
			System.out.println("Rows No. :: "+i+"   "+"Column size: "+cols.size());
		}
		driver.quit();

	}

}
