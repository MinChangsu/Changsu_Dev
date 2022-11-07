package day20;
import java.util.*;
import java.util.function.*;

public class Reduce01 {

	public static void main(String[] args) {
		List<String>ls=Arrays.asList("Box","Simple","Complex","Robot");
		BinaryOperator<String> lc=(s1,s2)->{
			if(s1.length()>s2.length())
				return s1;
			else
				return s2;};
			String str =ls.stream()
					.reduce("", lc);
			System.out.println(str);

	}

}
