package day19;

import java.util.function.Predicate;
import java.util.*;

public class predi01 {
	public static int getMax(Predicate<Integer> p,List<Integer> li) {
		int max=0;
		for(int n:li) {
			if(p.test(n)) {
				if(max<n) 
				{max=n;}
			}}
		return max;
	}
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		int m=getMax(n->n%2==0,list);
		System.out.println(m);
		

	}

}
