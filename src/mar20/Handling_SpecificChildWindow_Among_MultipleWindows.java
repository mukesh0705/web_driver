package mar20;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_SpecificChildWindow_Among_MultipleWindows {

	public static void main(String[] args) throws Throwable {
		//Handling Specific Child Window Among Multiple Windows
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.get("https://gmail.com");
         Thread.sleep(5000);
       //click three links related to gmail 
 		driver.findElement(By.linkText("Help")).click();
 		driver.findElement(By.linkText("Privacy")).click();
 		driver.findElement(By.linkText("Terms")).click();
 		//store all window into array list
 		ArrayList<String> brow=new ArrayList<String>(driver.getWindowHandles());
 		System.out.println(brow);
 		//switch to child window
 		String parent=brow.get(0);
 		String child1=brow.get(1);
 		String child2=brow.get(2);
 		String child3=brow.get(3);
 		driver.switchTo().window(child2);
 		driver.findElement(By.linkText("Community")).click();
 		Thread.sleep(5000);
 		driver.close();
 		Thread.sleep(5000);
 		driver.switchTo().window(child1);
 		driver.findElement(By.xpath("(//a[.='Technologies'])[1]")).click();
 		Thread.sleep(5000);
 		driver.close();
 		Thread.sleep(5000);
 		driver.switchTo().window(child3);
 		driver.findElement(By.xpath("(//a[.='FAQ'])[1]")).click();
 		Thread.sleep(5000);
 		driver.close();
 		Thread.sleep(5000);
 		driver.switchTo().window(parent);
 		driver.findElement(By.name("identifier")).sendKeys("mkcoolmukesh123");
 		Thread.sleep(5000);
 		driver.close();
 		
 		
	}

}
