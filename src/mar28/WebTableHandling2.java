package mar28;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling2 {

	public static void main(String[] args) throws Throwable {
		//Write a script to print Table Data
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement webTable=driver.findElement(By.className("dataTable"));//Collection of all data of a particular table within a "webTable" variable.
		List<WebElement> Allrows=webTable.findElements(By.tagName("tr"));//Collection of data of all rows within a variable "Allrows" with index no..
		int rows=Allrows.size()-1;
		System.out.println("No. of rows::  "+rows);
		//iterate all rows
		for (WebElement eachrow : Allrows) {
			List<WebElement> cols=eachrow.findElements(By.tagName("td"));//Collection of data of each column in a variable "cols" within each rows with index no..
			System.out.println("No. of cols::"+cols.size());
			//iterate all cells/columns::This "for loop" within a another "for loop" because here columns take place within the rows. 
			for (WebElement eachcell : cols) {
				Thread.sleep(500);
				String colsData=eachcell.getText();//Collection of string type data of each column in a variable named "colsData"
				System.out.println(colsData+" \n");
			}
			//System.out.println();
			System.out.println("=========================================");
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
