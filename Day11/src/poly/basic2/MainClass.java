package poly.basic2;

public class MainClass {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.method1();
		p.method2();
		
		Child c = new Child();
		c.method1(); //상속받은 메서드
		c.method2(); // 오버라이딩
		c.method3(); //자식
		
		System.out.println("-------다형성 -------");
		Parent p1 = c;
		
		System.out.println(c); 
		System.out.println(p1); 
		System.out.println(c==p1); // 동일한 주소값
		
		p1.method1();
		p1.method2();
//		p1.method3(); (X)
		
		/*
		 * 다형성 적용시 자식이 갖고있던 본래의 맴버에는 접근 불가
		 * 다만,재정의된 메서드는 정상호출 가능 (오버라이딩 메서드로)
		 */
		
		System.out.println( " ------클래스 캐스팅 -------");
		Parent  pp =new Child();
		Child cc = (Child)pp;
		
		/*
		 * 다형성이 일어나지 않은 객체를 대상으로 클래스 캐스팅을 실행하면
		 * 에러가 발생합니다.
		 */
		
		//에러발생
		Parent ppp = new Parent();		
		Child ccc= (Child) ppp;
		
		
		
		
		
	} 
	
	
}
