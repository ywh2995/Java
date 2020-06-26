package quiz5;

public class AccountMain {

	public static void main(String[] args) {
		Account p1 = new Account("홍길동","1234",3600);
		p1.deposit(4000);
		p1.withDraw(500);
		
		int bal = p1.getBalance();
		System.out.println(p1.name + "님의 계좌 잔액은 :"+bal+"원 입니다.");
		
	}

}
