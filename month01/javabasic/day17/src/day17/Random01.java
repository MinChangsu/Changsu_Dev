package day17;
import java.util.*;
public class Random01 {

	public static void main(String[] args) {
	Random rn =new Random();
	int n1=1;
	int n2=46;
	int m=0;
	ArrayList<Integer> lo = new ArrayList<Integer>();
	while(lo.size()<6) {
		Integer num=rn.nextInt(n1,n2);
		if(lo.contains(num)==false) {
			lo.add(m,num);
		}
	}
	Collections.sort(lo);
	for(Integer a:lo) {
		System.out.print(a+" ");}
	}

	}

