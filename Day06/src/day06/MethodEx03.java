package day06;

public class MethodEx03 {

	public static void main(String[] args) {
		
		/*
		 * 반환유형(return type)
		 * 1. 반환유형은  메서드가 실행한 결과를 돌려주는 값에 대한 type입니다.
		 * 2. 반환유형이 있는 메서드는 호출구문이 하나의 값이 되기 때문에 다른 메서드의 매개값으로도 사용됩니다.
		 * ex) println( 메서드호풀)
		 * 3. 반환값이 없는 경우는 반환유형 자리에 void 라고 적습니다.
		 * 4. 모든 메서드는 return을 만나면 종료
		 * 		그렇기 때문에 return 아래에 코드를 작성할 수 없습니다.
		 * 
		 */
		
		add(3,5);
		System.out.println("add:"+add(calSum(4),5));
		
		//리턴값이 없기떄문에 호출만 가능
		sub(5,2);
		
		multi();
		
		noReturn("똑똑이");
		
		
	}//main
	static int add(int a,int b) {
		
		return a+b;
	}
	static int calSum(int a) {
		int sum=0;
		for(int i=1;i<=a;i++) {
			sum+=i;
		}
		return sum;
	}
	//반환유형이 없는 메서드
	static void sub(int a, int b) {
	System.out.println(a+"-"+b+"="+(a-b));
	}
	
	static void multi() {
		System.out.println("5x30=15");
	}
	
	static void noReturn(String s) {
		if(s.equals("똑똑이")) {
			System.out.println("알아");
			return;	
		}
		System.out.println(s+" 문자열이 아니고 똑똑이를 입력하세요");
		
			
	}
	
	
	
	
	
}
