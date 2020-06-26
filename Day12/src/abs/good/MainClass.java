package abs.good;

public class MainClass {

	public static void main(String[] args) {
		
		// 1. 추상클래스를 사용하면 오버라이딩이 강제화되어 프로그래머의 오버라이딩
		//	    실수 최소화
		// 2. 다형성을 안전하게 사용할 수 있게 해주는 원리
		//    추상 클래스는 객체 생성이 안됩니다;
		
		SeoulStore s =new SeoulStore();
		s.apple();
		s.banana();
		s.orange();
		s.melon();
		System.out.println(	"상호명"+	s.getName());
		s.mango();

		BusanStore b = new BusanStore();
		
		System.out.println("상호명"+s.getName());
		b.apple();
		b.banana();
		b.orange();
		b.mango();
	}

}
