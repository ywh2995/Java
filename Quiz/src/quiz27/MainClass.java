package quiz27;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		
		try {
			int result = calc.input();
			System.out.println("결과 :"+result );
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
