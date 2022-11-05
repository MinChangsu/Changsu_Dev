package day13;

class Account{
	int balance=0;//인스턴스 변수
	//인스턴스 메소드 규칙 static을 쓰면 안됨
	int deposit(int money) {
		balance+=money;
		return balance;}
	int withdraw(int money){
		balance-=money;
		return balance;}
	void check() {
		System.out.println("현재 잔액은:"+balance);}
	
}

public class bankcus {

	public static void main(String[] args) {
		//account 라는 붕어빵 틀에 반죽을 넣고 붕어빵을만들자 
	Account min=new Account();
	Account kim=min;
	
	min.balance=10000;
	kim.balance=90000;
	min.deposit(1000);
	min.withdraw(500);
	kim.withdraw(500);
	kim.deposit(1000);
	min.check();
	kim.check();
	
	
	}

}
