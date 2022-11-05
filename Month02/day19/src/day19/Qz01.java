package day19;
interface Calculato<T>{
	T cal(T a,T b);
}
public class Qz01 {
	public static <T> void calandshow(Calculato<T> op,T n1, T n2) {
		T r=op.cal(n1, n2);
		System.out.println(r);
	}

	public static void main(String[] args) {
//		Calculato<Integer> x=(a,b)->a+b;
//		Qz01.calandshow(x, 5, 8);
		Qz01.<Integer>calandshow((n1,n2)->n1+n2,5,8);
	}

}
