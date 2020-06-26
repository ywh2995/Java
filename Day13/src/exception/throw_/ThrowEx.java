package exception.throw_;

public class ThrowEx {

	public static int calc(int n) throws Exception {
	if(n<=0) {
		throw new Exception("0보다 큰값을 입력");
	}
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}return sum;
	}
	
	
	public static void main(String[] args) {
		// 예외 강제 발생시키기 throw
		/*
		 * 메서드나 생성자 실행 도중에 throw 키워드를 만나면
		 * 즉시 throw 로 생성한 예외가 발생합니다.
		 * 
		 * 예외가 발생되면 실행되던 코드는 즉시 중단되고 예외를 처리할 수 있는  catch문으로 바로 이동
		 * 죽, 메서드 강제종료 사용
		 */
		
		try {
			System.out.println("결과 : "+calc(10));
			System.out.println("결과 : "+calc(-10));
			
		}catch(Exception e) {
//			System.out.println(e.getMessage()); // 예외 발생시 전달할 예외 메세지 얻어오는 기능
			e.printStackTrace(); //printStackTrace() 예외의 경로를 추적하는 메시지를 출력해줍니다
								//예외 원인을 찾을 때 매번 사용
		}
	}

	
	
	
	
}
