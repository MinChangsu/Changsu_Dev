package page3;
import java.util.*;
//머쓱이는 친구에게 모스부호를 이용한 편지를 
//받았습니다. 그냥은 읽을 수 없어 이를 해독하는 
//프로그램을 만들려고 합니다. 문자열 letter가 
//매개변수로 주어질 때, letter를 영어 소문자로 
//바꾼 문자열을 return 하도록 solution 함수를
//완성해보세요. 모스부호는 다음과 같습니다.
//morse = { 
//	    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
//	    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
//	    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
//	    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
//	    '-.--':'y','--..':'z'
//	}

public class Qz48 {
    public String solution(String letter) {
        String answer = "";
       Map<String,String> mores =new HashMap<>();
       mores.put(".-","a");
       mores.put("-...","b");
       mores.put("-.-.","c");
       mores.put("-..","d");
       mores.put(".","e");
       mores.put("..-.","f");
       mores.put("--.","g");
       mores.put("....","h");
       mores.put("..","i");
       mores.put(".---","j");
       mores.put("-.-","k");
       mores.put(".-..","l");
       mores.put("--","m");
       mores.put("-.","n");
       mores.put("---","o");
       mores.put(".--.","p");
       mores.put("--.-","q");
       mores.put(".-.","r");
       mores.put("...","s");
       mores.put("-","t");
       mores.put("..-","u");
       mores.put("...-","v");
       mores.put(".--","w");
       mores.put("-..-","x");
       mores.put("-.--","y");
       mores.put("--..","z");
      String[] mo=letter.split(" ");
      for(String s:mo)
    	  answer+=mores.get(s);
        return answer;
    }
	public static void main(String[] args) {
		

	}

}
