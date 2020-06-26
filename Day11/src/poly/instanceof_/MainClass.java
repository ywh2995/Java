package poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {

	//다형성 적용
		Student hong = new Student("홍길동",20,"123");
				
		Teacher lee=new Teacher("이승철", 123, "음악");
	
		Imployee choi  = new Imployee("최강창민", 32, "회계");

		printInfo(hong);
		printInfo(lee);
		printInfo(choi);
	}

	public static void printInfo(Person p) {
		if(p instanceof Student) { // p 값이 student 라면 true 반환
			Student s = (Student)p;
			System.out.println(s.info());
		}else if( p instanceof Teacher) {
			Teacher t = (Teacher)p;
			System.out.println(t.info());
		}else if(p instanceof Imployee) {
			Imployee i = (Imployee)p;
			System.out.println(i.info());
		}
		
	}
}

