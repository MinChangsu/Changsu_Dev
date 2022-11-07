package day20;
import java.io.*;
public class IOsteam03 {

	public static void main(String[] args) {
		try(DataInputStream ip =new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("b.dat")))){
			int k=ip.readInt();
			double j=ip.readDouble();
			System.out.println(k);
			System.out.println(j);
			
		}
catch(IOException e) {
	e.printStackTrace();
}
	

	}

}
