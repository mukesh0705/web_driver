package mar30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatement_explicit {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.opencart.com/");
	    WebDriverWait mywait=new WebDriverWait(driver, 20);
	    mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='My Account']")));
	    driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	    mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
	    driver.findElement(By.linkText("Login")).click();
	    mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("email")));
	    driver.findElement(By.name("email")).sendKeys("tictok835646@gmail.com");
        driver.close();
	}

}
