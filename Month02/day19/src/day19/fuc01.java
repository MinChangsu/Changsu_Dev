package day19;
import java.util.*;
import java.util.function.*;

class Justsort{
	public void sort(List<?>ls1) {
		Collections.reverse(ls1);
	}
}
public class fuc01 {

	public static void main(String[] args) {
		List<Integer> ls =Arrays.asList(1,2,3,4,5);
		ls=new ArrayList<>(ls);
		Justsort js =new Justsort();
		Consumer<List<Integer>> c =js::sort;
		c.accept(ls);
		System.out.println(ls);

	}

}
