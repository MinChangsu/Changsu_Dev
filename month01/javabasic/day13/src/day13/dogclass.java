package day13;

class Ge{
	String name;
	int age;
	
	public Ge(String n,int a) {
		name=n;
		age= a;}
	public void ro () {
		System.out.printf("%s의 이름은 나이는 %d 입니다.\n",name,age);
	}
	}


public class dogclass {

	public static void main(String[] args) {
		Ge d1= new Ge("바둑",3);
		Ge d2= new Ge("해피",2);
		
		d1.ro();
		d2.ro();
		
		
	}

}
