package day19;
import java.util.*;
import java.util.function.*;
public class pr3 {

	public static void main(String[] args) {
		List<String> ls =Arrays.asList("Box","Robot");
		ls.forEach(s->System.out.println(s));
		ls.forEach(System.out::println);

	}

}
