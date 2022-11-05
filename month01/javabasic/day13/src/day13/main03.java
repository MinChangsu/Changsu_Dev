package day13;

public class main03 {

	public static void main(String[] args) {
	div(5, 3);

	}
	public static void div(float num1,float num2) {
		if(num2==0) {
			System.out.println("0으로 나눌수 없음");
		return; }
		System.out.println("나눗셈 결과: "+num1/num2);
	}

}
