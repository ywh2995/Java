package generic.basic03;

public class MainClass {

	public static void main(String[] args) {
		
		Course<Student> course = new Course<>();
		
		course.setNum("1");
		course.setStudent(new Student("홍길자",20));
		
		ITBank b = new ITBank();
		b.info(course);
		b.info(b.get());

	}

}
