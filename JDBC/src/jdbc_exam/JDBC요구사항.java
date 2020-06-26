package jdbc_exam;

import java.util.ArrayList;

public class JDBC요구사항 {
	
	public static void main(String[] args) {
		
		/*
		 * 회원관리 프로그램, 도서관리, 음악관리, 데이터관리 등등 아무 주제를 선택해서
		 * JDBC프로그램을 작성합니다.
		 * 
		 * 단, 테이블은 5개 이상 관계형 데이터베이스 설계
		 * 인터페이스를 반드시 사용합니다.
		 * ArrayList, Map중에 하나 이상 반드시 사용합니다.
		 * 메서드는 8개 이상, 짝궁과 협업
		 * 
		 * --주제 자유--
		 */
		
		Person p1 = new Employee("홍길동",false);
		Person p2 = new JustPerson("홍길자",false);
		Person p3 = new Confirmer("이순신",true);
		Person p4 = new Employee("가가가",false);
		Person p5 = new JustPerson("나나나",false);
		Person p6 = new Confirmer("다다다",true);
		Person p7 = new Employee("라라라",false);
		Person p8 = new JustPerson("마마마",false);
		Person p9 = new Confirmer("바바바",true);
		
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);
		list.add(p9);
		
		
		if(p1 instanceof Employee) {
			Employee e = (Employee) p1;
			e.Inspection(p6);
			e.Inspection(p7);
		}
		
		if(p3 instanceof Confirmer) {
			Confirmer c = (Confirmer) p3;
			c.Isolation_Release();
		}
		if(p5 instanceof JustPerson) {
			JustPerson j = (JustPerson) p5;
			j.NightLife();
		}
		
		
	}

}
