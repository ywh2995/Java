package exception.trycatch;

public class TryCatchEx01 {
	public static void main(String[] args) {
		int i =10;
		int j = 0;
		
		System.out.println(i+j);
		
		try {
			System.out.println(i/j);
			
			System.out.println("예외 발생 시 이문장은 실행되지 않습니다");
			
		// catch 뒤에는 해당 예외를 처리할 예외의 종류 클래스를 선언합니다.
		// Exception 은 모든 예외를 처리 할 수 있다.
		} catch (Exception e) {
			System.out.println("0으로 나누지 마세요");
		}
		System.out.println(i-j);
		
		
		
	}
	
}
