package day17;

import java.util.Arrays;

public class array01 {

	public static void main(String[] args) {
		int[] org = {5,4,3,2,1};
		int[] cpy =new int[5];
		cpy=Arrays.copyOf(org, 3);
		
		for(int v:cpy) {
			System.out.println(v);
		}

	}

}
