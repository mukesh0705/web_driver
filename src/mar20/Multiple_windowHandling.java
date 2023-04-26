package mar20;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_windowHandling {

	public static void main(String[] args) throws Throwable {
		//Handling Specific Child Window Among Multiple Windows
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.irctc.co.in/nget/train-search");
        Thread.sleep(5000);
        String parent=driver.getWindowHandle();
        System.out.println(parent);
      //click fllowing links related to irctc
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
		driver.findElement(By.xpath("//span[@class='railDrishti fa fa-line-chart']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circlefour']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circlefive']")).click();
		//store all window into array list
		ArrayList<String> brow=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brow);
		//switch to child window
		String child1=brow.get(1);
		String child2=brow.get(2);
		String child3=brow.get(3);
		String child4=brow.get(4);
		String child5=brow.get(5);
		driver.switchTo().window(parent);
		String kw=driver.getTitle();
		System.out.println(kw);
		driver.switchTo().window(child1);
		String ka=driver.getTitle();
		System.out.println(ka);
		driver.switchTo().window(child2);
		String kb=driver.getTitle();
		System.out.println(kb);
		driver.switchTo().window(child3);
		String kc=driver.getTitle();
		System.out.println(kc);
		/*Thread.sleep(5000);
		Actions tr=new Actions(driver);
		tr.moveToElement(driver.findElement(By.linkText("Performance-indicators"))).click().perform();
		Thread.sleep(5000);
		tr.moveToElement(driver.findElement(By.linkText("UTS Revenue"))).click().perform();
		Thread.sleep(5000);*/
		driver.switchTo().window(child4);
		String kd=driver.getTitle();
		System.out.println(kd);
		driver.switchTo().window(child5);
		String ke=driver.getTitle();
		System.out.println(ke);
		Thread.sleep(5000);
		driver.quit();
		

	}

}
