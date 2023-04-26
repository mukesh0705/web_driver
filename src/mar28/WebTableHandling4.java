package mar28;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling4 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(500);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		Thread.sleep(500);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
		Thread.sleep(500);
		WebElement webTable=driver.findElement(By.id("resultTable"));
		List<WebElement> All_rows=webTable.findElements(By.tagName("tr"));
		int rows=All_rows.size()-1;
		System.out.println("No. of rows::  "+rows);
		List<WebElement> colss=webTable.findElements(By.tagName("td"));
		System.out.println("No. of Total cells::  "+colss.size());
		System.out.println("========================================");
		for (int i = 1; i <=rows; i++) {
			List<WebElement> cols=All_rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j <cols.size(); j++) {
				String celldata=cols.get(j).getText();
				System.out.println(celldata+" \n\t");
			}
			System.out.println("========================================");
			System.out.println();
		}
		driver.quit();


	}

}
