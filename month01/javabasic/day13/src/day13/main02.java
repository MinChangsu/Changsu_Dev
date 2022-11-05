package day13;

public class main02 {

	public static void main(String[] args) {
	double my_ki=173.5;
	hi(27,174.1);
	hi(28,my_ki);
	by();
	
	System.out.println(adder(34,12));
  
	}
	public static void hi(int age, double ki) {
		System.out.printf("제 나이는 %d입니다.\n",age);
		System.out.printf("제 키는 %.1f입니다.\n",ki);
	}
	public static void by() {
		System.out.println("잘가");
		
}
	public static int adder(int num1,int num2) {
		return num1+num2;
	}
	
}
