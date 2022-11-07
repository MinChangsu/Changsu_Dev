package day20;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Review01 {

	public static void main(String[] args) {
		List<String> ls=Arrays.asList("oh","good","bad","happy");
		String result=ls.stream().reduce("very nice",(s1,s2)->{
			if(s1.length()>s2.length())
				return s1;
			else
				return s2;
		});
System.out.println(result);
	}

}
