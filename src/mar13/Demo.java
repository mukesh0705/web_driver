package mar13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Demo {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/search?q=tata+cliq&rlz=1C1RXQR_enIN1034IN1035&oq=&aqs=chrome.7.35i39i362l8.475788977j0j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='yIn8Od']//span[@class='BTu2cd'][normalize-space()='Tata CLiQ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[@class='App__base']/div[@class='DesktopHeader__base']/div[@class='DesktopHeader__headerHolder']/div[@class='DesktopHeader__headerFunctionality']/div[@class='DesktopHeader__upperHeader']/div[@class='DesktopHeader__loginAndTrackTab']/div[@class='DesktopHeader__signInAndLogout']/div[2]")).click();
		driver.findElement(By.name("mobileNumber")).sendKeys("8507720705");
		driver.findElement(By.xpath("//button[@id='continueBtn']")).click();
		driver.findElement(By.id("otp_0")).sendKeys("7");
		driver.findElement(By.id("otp_1")).sendKeys("1");
		driver.findElement(By.id("otp_2")).sendKeys("7");
		driver.findElement(By.id("otp_3")).sendKeys("7");
		driver.findElement(By.id("otp_4")).sendKeys("9");
		driver.findElement(By.id("otp_5")).sendKeys("4");
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
	    Thread.sleep(5000);
		driver.close();


	}

}
