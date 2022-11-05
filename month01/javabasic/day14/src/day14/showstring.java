package day14;

public class showstring {

	public static void main(String[] args) {
		
		String t1="안녕하세요";
		String t2=t1;
		
		String t3="안녕하세요";
		String t4=new String("안녕하세요");
		
		
		if(t1==t2)
			System.out.println("두개같음");
		else
			System.out.println("다름");
		if(t3==t4)
			System.out.println("두개같음");
		else
			System.out.println("다름");
	}

}
