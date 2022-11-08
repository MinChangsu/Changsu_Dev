package day21;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class Simplebinwrite {

	public static void main(String[] args) throws IOException{
		Path fp =Paths.get("/Users/changsu/Desktop/Developer_Min/Changsu_Dev/Month02/day21");
		fp =Files.createFile(fp);
		
		byte buf1[]= {0x13,0x14,0x15};
		for(byte b:buf1)
			System.out.print(b+"\t");
System.out.println();
Files.write(fp, buf1, StandardOpenOption.APPEND);
byte buf2[]=Files.readAllBytes(fp);
for(byte b:buf2)
	System.out.print(b+"\t");
System.out.println();

	}

}
