package prpack;
import java.util.*;
public class Login {

	public static void main(String[] args) {
		Map<String,String>user= new TreeMap<>();
		user.put("mgs1527", "81fa30619@");
		user.put("alsrudtj1527", "81fa30619@A");
		user.put("mgs115", "81fa30619@@");
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("ID를입력하세요");
		String ID =sc.nextLine().trim();
		if(!user.containsKey(ID)) {
				System.out.println("ID가 없는 ID입니다.");
				continue;}
		System.out.println("비밀번호를 입력하세요");
		String Password =sc.nextLine().trim();
		if(!Password.equals(user.get(ID))){
			System.out.println("비밀번호가 올바르지 않습니다.");}
		else {
			System.out.println("로그인 되었습니다.");
			break;
		}
		
		
		}
		
		
	}

}
