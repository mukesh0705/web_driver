package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecureOrNot_url {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://www.tatacliq.com/");
		//driver.get("http://facebook.com");
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        Thread.sleep(5000);
        String expected ="https://";
        String actual =driver.getCurrentUrl();
        if(actual.startsWith(expected))
        {
        	System.out.println("url is secured::"+expected+"\t"+actual);
        }
        else
        {
        	System.out.println("url is not secured::"+expected+"\t"+actual);
        }
        driver.quit();
	}

}
