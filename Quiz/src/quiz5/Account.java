package quiz5;

public class Account {
	String name;
	String pw;
	int balance;

	Account() {
		
}
	Account(String pName,String pPw,int pBalance){
		name = pName;
		pw = pPw;
		balance = pBalance;
	}
	void deposit(int a) {
		balance += a;
	}
	void withDraw(int b) {
		balance -= b;
	}
	int getBalance() {
		return balance;
	}
		

}
