package day15;

import java.util.Arrays;

class Bo12{
	private String conts;
	
	Bo12(String cont){this.conts=cont;}
	public String toString() {return conts;}
	
}


public class pr2 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= new int[4];
		Arrays.fill(b, 0,2,3);
		System.arraycopy(a, 0, b, 0, 4);
		for(int i:b) {
			System.out.println(i);

			
		}
	}

}
