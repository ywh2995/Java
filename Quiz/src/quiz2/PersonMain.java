package quiz2;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 12;
		
		p1.info();
		
		Person p2 = new Person();
		p2.name = "홍길자";
		p2.age = 15;
		
		p2.info();
	}
}

