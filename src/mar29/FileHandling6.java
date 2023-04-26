package mar29;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandling6 {

	public static void main(String[] args) throws Throwable {
		//write a script to validate multiple time login functionality in orangeHRM
		//This class use to reading the path of the text file
		FileReader fr=new FileReader("D:\\Logindata.txt");
		//This class use to allocating memory  for file reader
		BufferedReader br=new BufferedReader(fr);
		String str="";
		while ((str=br.readLine())!=null) {
			String x[]=str.split(";");
			WebDriver driver=new ChromeDriver();
			driver.get("http://orangehrm.qedgetech.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.name("txtUsername")).sendKeys(x[0]);
			driver.findElement(By.name("txtPassword")).sendKeys(x[1]);
			driver.findElement(By.name("Submit")).click();
			String Expected="dashboard";
			String Actual=driver.getCurrentUrl();
			if (Actual.contains(Expected)) {
				System.out.println("Login success:: "+Expected+" "+Actual);
			}
			else {
				System.out.println("Login fail:: "+Expected+" "+Actual);
				Date date=new Date();
				DateFormat df=new SimpleDateFormat("DD_MM  hh_mm_ss");
				String datef =df.format(date);
				File screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screen,new File("D://ScrShot/"+datef+"_"+"LoginFail.jpg"));
			}
			driver.quit();
		}

	}

}
