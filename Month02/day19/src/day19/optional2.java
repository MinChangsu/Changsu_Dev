package day19;
import java.util.*;
public class optional2 {

	public static void main(String[] args) {
		Optional<String> os1 =Optional.empty();
		Optional<String>os2=Optional.of(new String("Running"));
		String reos=os1.map(s->s.toUpperCase())
								.orElse("없어요");
		
	}

}
