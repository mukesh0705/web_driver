package mar23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_iFrame {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		//get collection of frames
		List<WebElement> All_Frames=driver.findElements(By.tagName("iframe"));
		System.out.println("No. of frames::  "+All_Frames.size());
		//switch to frame
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		ac.clickAndHold(source).moveToElement(target).release().perform();
		//switch to main HTML page
		driver.switchTo().defaultContent();
		//click on Button link using mouse
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
		//click on Menu link by selenium itself
		driver.findElement(By.linkText("Menu")).click();
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
