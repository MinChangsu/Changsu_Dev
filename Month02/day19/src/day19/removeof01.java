package day19;
import java.util.*;
import java.util.function.*;
public class removeof01 {
	
	public static void main(String[] args) {
		List<Integer>ls1=Arrays.asList(1,-2,3,-4,5);
		ls1=new ArrayList<>(ls1);
		List<Double>ls2=Arrays.asList(1.0,-2.0,3.0,-4.0,5.0);
		ls2=new ArrayList<>(ls2);
		Predicate<Number> p= n -> n.doubleValue()<0.0;
		ls1.removeIf(p);
		ls2.removeIf(p);
		System.out.println(ls1);
		System.out.println(ls2);
	}

}
