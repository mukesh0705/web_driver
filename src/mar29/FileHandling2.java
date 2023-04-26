package mar29;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileHandling2 {

	public static void main(String[] args) throws Throwable {
		//Write a script to read text line-by-line from a text file 
		FileReader fr=new FileReader("D:\\Sample.txt");
		BufferedReader br=new BufferedReader(fr);
		String str="";
		while ((str=br.readLine())!=null) {
			Thread.sleep(5000);
			System.out.println(str);
		}

	}

}
