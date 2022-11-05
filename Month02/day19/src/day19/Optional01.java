package day19;
import java.util.*;

public class Optional01 {

	public static void main(String[] args) {
		Optional<String> os1=Optional.of(new String("Friday"));
		Optional<String> os2=Optional.ofNullable(new String("Sunday"));
		
			
		os1.ifPresent(s->System.out.println(s));
		os2.ifPresent(System.out::println);

	}

}
