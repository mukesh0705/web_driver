package mar29;
import java.io.*;
public class FileHandling1 {

	public static void main(String[] args) throws Throwable {
		//write script to write some text line-by-line in a text file and that file save in a Drive.
		File f=new File("D:\\Sample.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("I am super HERO");
		bw.newLine();
		bw.write("so i decided to fly");
		bw.newLine();
		bw.write("and cath the wave of any rays");
		bw.flush();
		bw.close();

	}

}
