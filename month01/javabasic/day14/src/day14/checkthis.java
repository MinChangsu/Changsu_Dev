package day14;
class lion{
	String name;
	lion(){
		name="심바";
		
	}
	lion(String name){
		this.name=name;
	}
}
class fox{
	String habi;
	fox(String habi){
		this.habi=habi;
		}
	fox(String habi,String nation){
		this(habi+nation);
	}
	
	
	
	
}
class tiger{
	String name;
	tiger(){
		this("호돌");
}
	tiger(String n){
		name=n;
		
	}
}
public class checkthis {
	tiger t1=new tiger();
	tiger t2=new tiger("티거");

	

}
