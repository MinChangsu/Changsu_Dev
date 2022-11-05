package day17;

import java.util.Arrays;

public class Araay04 {

	public static void main(String[] args) {
		int[] ar= {33,55,11,44,22};
		Arrays.sort(ar);
		for(int n:ar)
			System.out.print(n+"\t");
		System.out.println();
		int idx = Arrays.binarySearch(ar, 33);
		System.out.println(idx);
	}

}
