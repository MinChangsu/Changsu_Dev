package day15;

class Woman{
	String name;
	Woman(String name){
		this.name=name;
	}

}
class BusinessWoman extends Woman{
	String company;
	String loc;
	BusinessWoman(String name,String company,String loc){
		super(name);
		this.company=company;
		this.loc=loc;}
		void intro() {
			System.out.println("내 이름은 "+name);
			System.out.println("내 직장은 "+company);
			System.out.println("내 사는곳은 "+loc);
			}
		
	}






public class Inher {

	public static void main(String[] args) {
		BusinessWoman b1 =new BusinessWoman("신윤진","삼성전자","대전");
		
		b1.intro();

	}

}
