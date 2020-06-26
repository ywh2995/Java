package quiz4;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		p1.tall = 199;
		p1.info();
		
		Person p2 = new Person("홍길자",24,189);
		p2.info();
		
	}

}
