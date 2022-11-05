package day14;



class person{
	String name;
	static String nation ="대한민국";
	
	void myname() {
		System.out.println("내이름"+name);
	}
	static void sayhi() {
		System.out.println("ㅎㅇㅎㅇ");
	}
	
}



public class Main {

	public static void main(String[] args) {
		person.nation="일본";
		person boy = new person();
		boy.name ="강윤호";
		person girl = new person();
		girl.name ="조보아";
		
		
			
		
	}

}
