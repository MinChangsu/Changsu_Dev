package day20;
import java.util.*;
import java.util.stream.*;

public class FlatMapStream {

	public static void main(String[] args) {
		Stream<String> ss1=Stream.of("MY_AGE","YOUR_LIFE");
		Stream<String> ss2=ss1.flatMap(s->Arrays.stream(s.split("_")));
		System.out.println(ss2);
		ss2.forEach(s->System.out.print(s+"\t"));
		
	}

}
