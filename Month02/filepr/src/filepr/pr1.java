package filepr;
import java.util.*;
import java.io.*;
public class pr1 {

	public static void main(String[] args) {
		File f1=new File("/Users/changsu/Desktop/test.text");
		File f2=new File("/Users/changsu/Desktop/jusic.csv");
		try {
		    BufferedWriter writer = new BufferedWriter(new FileWriter(f1,true));
		    writer.write("ㅎㅇㅎ");
		    writer.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader(f2));
			 String str;
		        while ((str = reader.readLine()) != null) {
		            System.out.println(str);
		        }
		} catch(IOException e){
			e.printStackTrace();
		}

	}

}
