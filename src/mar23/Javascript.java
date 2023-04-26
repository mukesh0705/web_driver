package mar23;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws Throwable {
		//Write java script for 1.Launching url And get 2.Title 3.URL 4.Domain name Along with length.
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		//Launch URL 
		JS.executeScript("window.location='https://amazon.in'");
		Thread.sleep(5000);
		//Print Title and it's length
		String pagetitle=JS.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		String strurl=JS.executeScript("return document.URL").toString();
		System.out.println(strurl);
		System.out.println(strurl.length());
		String domainName=JS.executeScript("return document.domain").toString();
		System.out.println(domainName);
		System.out.println(domainName.length());
		Thread.sleep(5000);
		driver.close();
	}

}
