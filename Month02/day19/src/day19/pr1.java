package day19;

import java.util.*;
import java.util.function.*;

public class pr1 {
	
	public static void main(String[] args) {
		List<Integer>ls=Arrays.asList(1,2,3,4,5);
		ls=new ArrayList<>(ls);
		Consumer<List<Integer>>c =Collections::reverse;
		c.accept(ls);
		System.out.println(ls);
		

	}

}
