package day18;

import java.util.*;

public class Map2 {

	public static void main(String[] args) {
		List<String> src =Arrays.asList("Box","Apple","Toy","Robot");
		
		List<String> dest =new ArrayList<>(src);
		Collections.sort(dest);
		System.out.println(dest);
		System.out.println(src);
		
		Collections.copy(dest, src);
		
		System.out.println(dest);
		System.out.println(src);
		
		int[] a = {1,2,3};
		System.out.println(a);
		List a1=Arrays.asList(1,2,3);
		System.out.println(a1);
	}

}
