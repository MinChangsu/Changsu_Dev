package day20;
import java.util.*;
import java.util.stream.*;
public class Stream01 {

	public static void main(String[] args) {
	List<String> list=Arrays.asList("box","toy","robot");
	list.stream()
		.forEach(s->System.out.println(s));

	}

}
