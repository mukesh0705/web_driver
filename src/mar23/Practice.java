package mar23;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://codepen.io/ovvn/full/Nqxzjg");
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		//get collection of frames
		List<WebElement> All_Frames=driver.findElements(By.tagName("iframe"));
		System.out.println("No. of frames::  "+All_Frames.size());
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("modules"));
		WebElement target=driver.findElement(By.id("dropzone"));
		ac.clickAndHold(source.findElement(By.linkText("Text"))).moveToElement(target).release().perform();
		Thread.sleep(1000);
		ac.clickAndHold(source.findElement(By.linkText("Textarea"))).moveToElement(target).release().perform();
		Thread.sleep(1000);
		ac.clickAndHold(source.findElement(By.linkText("Number"))).moveToElement(target).release().perform();
		Thread.sleep(5000);
		driver.close();

	}

}
