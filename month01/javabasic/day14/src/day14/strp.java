package day14;


public class strp {

	public static void main(String[] args) {
//		String birth="<양>"+7+'.'+16;
//		
//		StringBuilder stb =new StringBuilder("123");
//		stb.append(45678);
//		System.out.println(stb.toString());
//		stb.delete(0, 2);
//		System.out.println(Integer.parseInt(stb.toString()));
		String str ="abcdefg";
		System.out.println(str.substring(0,1));
		String st1 ="Lexico";
		String st2 ="lexico";
		
		if(st1.equals(st2))
			System.out.println("같음");
		else
			System.out.println("다름");
		int cmp=st1.compareTo(st2);
		if(cmp==0)
			System.out.println("두 문자열은 일치");
		else if (cmp<0)
			System.out.println("사진에 앞에 위치하는문자"+st1);
		else
			System.out.println("사전에 앞에 위치하는문자"+st2);
		double e =2.7182;
		String se = String.valueOf(e);
		System.out.println(e);
		int[] a = {1,2,3,4};
		for(int i:a) {
			System.out.println(i);
		}
			
		
	
	
	
	}	

}
