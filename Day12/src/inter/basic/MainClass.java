package inter.basic;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic b = new Basic();
		b.method1();
		b.method2();
		b.method3();
		
		System.out.println(b.ABC);
		System.out.println(b.PI);
		System.out.println("===================");
		/*
		 * 인터페이스도 하나의 데이터 타입이 될 수 있습니다.
		 * 인터페이스에 객체를 저장했을 때 ,다형성의 형태 동일하게 시행
		 */
		Inter1 i1 = b; 
		i1.method1();// 오버라이딩 된 메서드
		
		Inter2 i2 = b;
		i2.method2();
		
		//인터페이스에도 클래스 캐스팅 가능
		Basic bb = (Basic) i1;
	
	
	}

}
