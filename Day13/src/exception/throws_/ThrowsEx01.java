package exception.throws_;

public class ThrowsEx01 {

	public static void main(String[] args) {
		/*
		 * 메서드나 생성자에서 발생되는 예외를 떠넘기는 키워드가 throws 입니다.
		 * throws 구문이 붙어있는 메서드 , 생성자를 호출 할 때는 예외처리를 대신 진행해야 합니다.
		 * 
		 * 즉, 예외처리를 강요할 때 사용합니다.
		 */

		try {
			//		greeting(10);
			calc(0);
		}catch (ArithmeticException e) {
			System.out.println("에러발생 ,1~2숫자입력");
		}
		
//		catch (Exception e) {
//			System.out.println("에러발생 ,1~2숫자입력");
//		}



		// 대표적인 메서드
		try {
			Class.forName("!@#!@#");

		}catch(Exception e){
			System.out.println("클래스를 찾을수 없습니다.");
			}
		}
		
	
	
	
		private static String[] arr = {"안녕하세요","Hello","니하오"};
		public static void greeting(int index) throws Exception{
			System.out.println(arr[index]); 
		}
		
		public static void calc(int a) throws ArithmeticException{
			System.out.println(10/a);
		}
		
	}
