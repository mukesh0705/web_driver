package mar17;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HListBox3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("sport shoe for men");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		/*List<WebElement> productBrand=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		productBrand.size();
		for (WebElement each : productBrand) {
			System.out.println(each.getText());
		}*/
		List<WebElement> productTitlesEle=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        List<WebElement> productPriceEle=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        
        for(int i=0;i<500;i++){
            System.out.println(productTitlesEle.get(i).getText()+"  Rs"+productPriceEle.get(i).getText());
        }
		
		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[6]")).click();
		Thread.sleep(5000);
		ArrayList<String> brow=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brow.size());
 		//switch to child window
 		String parent=brow.get(0);
 		String child1=brow.get(1);
 		driver.switchTo().window(child1);
		String productTitle=driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
		System.out.println(productTitle);
		//Store all three list boxes into select class
		Select quantity =new Select(driver.findElement(By.xpath("//select[@id='quantity']")));
		//Verify list box is single or multi selection 
		boolean value1=quantity.isMultiple();
		System.out.println(value1);
		quantity.selectByVisibleText("3");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
