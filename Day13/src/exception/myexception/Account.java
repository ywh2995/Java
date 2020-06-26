package exception.myexception;

public class Account {
	/*
	 * 1. 잔액(balance : long)으로 멤버 변수를 선언 private 제한자
	 * 2. deposit 입금기능
	 * 3. withDraw 출금기능
	 * 4. getBalance : long 잔액확인기능
	 * 
	 * 5. 출금기능에서 잔액이 출금금액 보다 작으면 예외발생시키는 코드를 작성
	 * 
	 */
	public Account() {
		
	}
	
	private long balance;

	public void deposit(long a) {
		balance += a;
	}
	public void withDraw(long a) throws MyException {
		if(balance < a) {
			throw new MyException("잔액부족 :"+(a-balance));
		}
		balance -=a;	
	}
	long getBalance() {
		return balance;
	}
		

}

