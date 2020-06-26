package final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("997-77", "홍길자");
//		p1.nation = "미국";
//		p1.ssn = "222";
		p1.name = "ss";
		
		System.out.println("국가 : "+p1.nation);
		System.out.println("주민번호 : "+p1.ssn);
		System.out.println("이름 : "+ p1.name);
		
		Person p2 = new Person("917-77", "홍길덩");
		
		
		
	}

}
