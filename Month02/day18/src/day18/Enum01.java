package day18;
enum Animal{
	Dog,Cat,Hamster,Turtle
}

class Phone{
	enum Company{
		Apple,Samsung
	}
	Company c;
	Phone(String c_name){
		if(c_name.equals("애플")) {
		c=Company.Apple;}
		else if(c_name.equals("삼성")) {
			c=Company.Samsung;}
	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "제조사는 "+c+" 입니다.";
	}
	
}

public class Enum01 {

	public static void main(String[] args) {
		
		
		Phone p1 =new Phone("삼성");
		
		
	
	}

}
