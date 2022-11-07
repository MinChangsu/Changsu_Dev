package day20;

import java.util.*;
import java.util.stream.*;

public class Mapping01 {

	public static void main(String[] args) {
		List<String>ls=Arrays.asList("Box","Robot","Simple");
		 ls.stream()
		.map(s->s.length())
		.forEach(s->System.out.println(s));

	}

}
