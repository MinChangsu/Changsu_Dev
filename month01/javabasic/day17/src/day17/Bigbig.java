package day17;
import java.math.BigInteger;
public class Bigbig {

	public static void main(String[] args) {
		System.out.println("최대 정수"+Long.MAX_VALUE);
		System.out.println("최소 정수"+Long.MIN_VALUE);
		System.out.println();
		BigInteger big1 =new BigInteger("10000000000000000000000000");
		BigInteger big2 =new BigInteger("-1000000000000000000000");
		BigInteger big3 =new BigInteger("-1000");
		BigInteger big4 =new BigInteger("2");
		
		BigInteger r1=big1.add(big2);
		System.out.println("덧셈결과"+r1);
		BigInteger r2=big1.multiply(big2);
		System.out.println("곱셈결과"+r2);
		System.out.println();
		
		int num =big3.intValueExact();
		int num2 =big3.intValue();
		System.out.println(num);
		System.out.println(num2);
		System.out.println(big4);
		
		
	}

}
