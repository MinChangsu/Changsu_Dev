package day20;
import java.util.*;
import java.util.stream.*;

class  Intcmp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
	
}
public class Sorting01 {

	public static void main(String[] args) {
		Stream<Integer> nlist=Stream.of(3,9,4,2);
		Stream<Integer> result =nlist.sorted(new Intcmp());
		Stream<Integer> result2 =nlist.sorted((n1,n2)->n2.intValue()-n1.intValue());
		result.forEach(n->System.out.println(n));

	}

}
