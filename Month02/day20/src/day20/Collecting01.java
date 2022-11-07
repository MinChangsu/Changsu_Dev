package day20;
import java.util.*;
import java.util.stream.*;
public class Collecting01 {

	public static void main(String[] args) {
		String[] words= {"good","nice","happy","sad"};
		Stream<String> ss=Arrays.stream(words);
				List<String> result=ss.filter(s->s.length()==4)
				.collect(()->new ArrayList<>(),
						(c,s)->c.add(s),
						(lst1,lst2)->lst1.addAll(lst2)
						);
				System.out.println(result);

	
	
	}

}
