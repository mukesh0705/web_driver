package mar08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	public static void main(String[] args) throws Throwable {
		// Creating instance object for chrome and firefox browser
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.firefox.driver","D:/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		
	}

}
