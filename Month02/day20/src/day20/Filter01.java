package day20;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Filter01 {

	public static void main(String[] args) {
		int[]ar ={1,2,3,4,5};
		Arrays.stream(ar)
		.filter(n->n%2==1)
		.forEach(n->System.out.println(n));
		System.out.println();
		
		List<String>s1=Arrays.asList("Toy","Robot","Box");
		s1.stream()
		.filter(s->s.length()==3)
		.forEach(s->System.out.println(s));
		
		

	}

}
