package day19;
import java.util.*;
import java.util.function.*;
public class Suppli01 {
	public static List<Integer> makeinli(Supplier<Integer> s,int n){
		List<Integer>list =new ArrayList<>();
		for(int i=0;i<n;i++)
			list.add(s.get());
		return list;
	}
	public static void main(String[] args) {
		Supplier<Integer> spr =() ->{
			Random rand =new Random();
			return rand.nextInt(1,50);
		};
		List<Integer>list =makeinli(spr,5);
		System.out.println(list);
		List<Integer>list2 =makeinli(spr,10);
		System.out.println(list2);
		
		
	}

}
