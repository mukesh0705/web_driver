package mar28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling5 {

	public static void main(String[] args) throws Throwable {
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
		//System.out.println(rows.f);
		Thread.sleep(5000);
		//iterate all rows
		for (WebElement eachrows : rows) {
			//get column collection
			List<WebElement> cols=eachrows.findElements(By.tagName("td"));
			for (WebElement eachcolls : cols) {
				String celldata=eachcolls.getText();
				System.out.println(celldata+" \n");
			}
			Thread.sleep(500);
		}
		driver.quit();

	}

}
