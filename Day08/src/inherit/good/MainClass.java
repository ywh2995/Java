package inherit.good;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name ="홍길동";
		s.age = 12;
		s.studentId = "1212";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.name ="홍길자";
		t.age = 20;
		t.subject = "math";
		System.out.println(t.info());
	
		Imployee e = new Imployee();
		e.name = "이순신";
		e.age = 42;
		e.department ="회계부";
		System.out.println(e.info());
		
		
	}

}

