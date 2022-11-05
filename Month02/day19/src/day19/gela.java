package day19;
@FunctionalInterface
interface Calculator<T>{
	T cal(T n1, T n2);
}
public class gela {

	public static void main(String[] args) {
		Calculator<Integer> c1 =(n1,n2)->n1+n2;
		Calculator<Double> c2 =(n1,n2)->n1+n2;
		System.out.println(c1.cal(3, 5));
		System.out.println(c2.cal(3.4, 5.));
	}

}
