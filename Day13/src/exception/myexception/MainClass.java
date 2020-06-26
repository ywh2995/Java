package exception.myexception;

public class MainClass {

	public static void main(String[] args) throws Exception {
		Account ac = new Account();
		try {
			ac.withDraw(3000);
		
		}catch (MyException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
