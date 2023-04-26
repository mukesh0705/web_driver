package mar24;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript3 {

	public static void main(String[] args) throws Throwable {
		//Write a java script to evolve it login functionality in OrangeHRM
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#txtUsername\").value='Admin2'");
		js.executeScript("document.querySelector(\"#txtPassword\").value='Qedge123!@#'");
		js.executeScript("document.querySelector(\"#btnLogin\").click()");
		Thread.sleep(5000);
		String Expected="dashboard";
		String Actual=js.executeScript("return document.URL").toString();
		if (Actual.contains(Expected)) {
			System.out.println("Login is success:: "+Expected+"  "+Actual);		
		}
		else {
			String errormsg=js.executeScript("return document.querySelector(\"#spanMessage\").innerHTML").toString();
			System.out.println(errormsg+"   "+Expected+"  "+Actual);
		}
		driver.quit();

	}

}
