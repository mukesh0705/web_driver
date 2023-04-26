package mar29;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandling5 {

	public static void main(String[] args) throws Throwable {
		//DateFormate,SimpleDateFormat,Format,TakesScreenshot,getscreenshotAs,OutputType.FILE,FileUtils.copyFile
		//File,FileWriter,BufferedWriter,FileReader,BufferedRader,write,newLine,flush,raedLine
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Amazon_rainforest");
		Thread.sleep(5000);
		File f =new File("D:/AmazonRainForest.doc");
		//This class is use to store physical file in a local Drive
        FileWriter fw=new FileWriter(f);
        //This class use to allocate memory for a file from any webApplication text
        BufferedWriter bw=new BufferedWriter(fw);
        String para1=driver.findElement(By.xpath("//p[position()=2]")).getText();
        String para2=driver.findElement(By.xpath("//p[position()=3]")).getText();
        String para3=driver.findElement(By.xpath("//p[position()=4]")).getText();
        //this method use to write some text in a file
        bw.write(para1);
        //This method use to move to next line in a file
        bw.newLine();
        bw.newLine();
        bw.write(para2);
        bw.newLine();
        bw.newLine();
        bw.write(para3);
        //This method use to push the text into file and also it will erase the existing text
        bw.flush();
        driver.quit();

	}

}
