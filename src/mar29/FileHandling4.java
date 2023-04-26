package mar29;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandling4 {

	public static void main(String[] args) throws Throwable {
		//write script to get both paragraph text separately in a text file and save in a drive.
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		File f =new File("D:/primus.txt");
		//File f =new File("D:/primus.doc");
        FileWriter fw=new FileWriter(f);
        BufferedWriter bw=new BufferedWriter(fw);
        String para1=driver.findElement(By.xpath("(//p[position()=1])[2]")).getText();
        String para2=driver.findElement(By.xpath("//p[position()=2]")).getText();
        bw.write(para1);
        bw.newLine();
        bw.newLine();
        bw.write(para2);
        bw.flush();
        driver.quit();
	}

}
