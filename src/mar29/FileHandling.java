package mar29;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandling {

	public static void main(String[] args) throws Throwable {
		//write a script to Get a screenshot and save that file in a drive by .png or .jpg or other image format with date and time.
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn.qedgetech.com/");
		Thread.sleep(5000);
		//java time stamp
		Date date=new Date();
		DateFormat df=new SimpleDateFormat("DD_MM  hh_mm_ss");
		String datef =df.format(date);
		//take screen shot and store
		File screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy file into local system 
		//FileUtils.copyFile(screen,new File("D://Screenshot/"+"Homepage.png"));
		FileUtils.copyFile(screen,new File("D://Screenshot/"+datef+"_"+"Homepage.png"));
		driver.close();

	}

}
