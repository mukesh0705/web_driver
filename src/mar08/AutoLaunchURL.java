package mar08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoLaunchURL {
          
	public static void main(String[] args) throws Throwable{
		
		WebDriver driver= new ChromeDriver();
		driver.get("http:\\google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("About"));
		Thread.sleep(5000);
		driver.close();
		//driver.quit();
		

	}

	
	

}
