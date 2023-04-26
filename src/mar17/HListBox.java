package mar17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HListBox {

	public static void main(String[] args) throws Throwable {
		// To select an item in list box.
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Create new accou")).click();
		Thread.sleep(5000);
		//Store all three list boxes into select class
		Select dayList =new Select(driver.findElement(By.name("birthday_day")));
		Select  monthList =new Select(driver.findElement(By.name("birthday_month")));
		Select yearList =new Select(driver.findElement(By.name("birthday_year")));
		//Verify list box is single or multi selection 
		boolean value1=dayList.isMultiple();
		boolean value2=monthList.isMultiple();
		boolean value3=yearList.isMultiple();
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(monthList);
		//Select any value in list box
		dayList.selectByVisibleText("12");
		dayList.selectByIndex(19);
		Thread.sleep(5000);
		monthList.selectByIndex(7);
		Thread.sleep(5000);
		monthList.selectByVisibleText("Dec");
		Thread.sleep(5000);
		yearList.selectByValue("1992");
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		Thread.sleep(5000);
		driver.close();	

	}

}
