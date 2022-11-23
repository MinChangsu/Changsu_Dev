package filepr;

import java.io.*;

class items{
static private int cnt=1;
private int pb;
	 private String name;
	 private String price;
	 items(){
		 this.pb=cnt++;
	 }
void setname(String n) {
	name=n;
}
void setprice(String p) {
	price=p;
}
String getname() {
	return this.name;
}
String getprice() {
	return this.price;
}

public String toString() {return pb+","+name+","+price;}
}


public class Item {

	public static void main(String[] args) {
		
		items bag=new items();
		bag.setname("나이키가방");
		bag.setprice("7000");
		
		items bag2=new items();
		bag2.setname("아디다스가방");
		bag2.setprice("7000");
		
		
		System.out.println(bag.toString2());
		
File f1=new File("/Users/changsu/Desktop/test3.csv");
		
		try {
		    BufferedWriter writer = new BufferedWriter(new FileWriter(f1,false));
		    
		    writer.write("cnt,name,price");
		    writer.write("\n");
		    writer.write(bag.toString2());
		    writer.write("\n");
		    writer.write(bag2.toString2());
		    writer.close();
		} catch (IOException e) {
		    e.printStackTrace();}
	
	}
	}
		
		
	


