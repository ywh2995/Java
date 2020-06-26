package generic.basic03;

public class ITBank {
	
	// Course<?> - ?는 뭐든 다 들어갈 수 있다.
	// Course<? extends Student> - Student 의 자식클래스는 다 들어감
	// Course<? super Student> - String 의 형태라면 다 들어감
	
	
	// 제네릭 클래스를 매개변수로
	public /*<T>*/ void info(Course<Student> c) {
		
		String num = c.getNum();
		Student student = c.getStudent();
		
		System.out.println("번호 :"+ num+", 이름 :" + student.getName()+", 나이 :"+student.getAge());
		
	}
	public Course<Student> get(){
	
		Course<Student> c = new Course<>();
		c.setNum("2");
		c.setStudent(new Student("홍길순",30));
		
		return c;
	}
	
	
	
	
	// 제네릭클래스를  반환유형으로
	
	
}
