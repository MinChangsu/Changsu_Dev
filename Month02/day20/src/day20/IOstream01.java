package day20;
import java.io.*;
public class IOstream01 {

	public static void main(String[] args) throws IOException {
		try(OutputStream os= new FileOutputStream("cpy.dat");
				InputStream is =new FileInputStream("data.dat")){
			byte[] buff=new byte[1024];		
			int data;
					while(true) {
						data=is.read(buff);
						if(data==-1) {
							break;
						}
						os.write(buff,0,data);}
				}
		
	}

}
