package poly.basic3;

public class MainClass {

	public static void main(String[] args) {
	
//	Student hong = new Student("홍길동",20,"123");
//	Student park = new Student("박찬호",30,"234");
//	Student son = new Student("손흥민",40,"222");
//	
//	Teacher lee=new Teacher("이승철", 123, "음악");
//	Teacher kim=new Teacher("김우신", 43, "역사");
//	
//	Imployee choi  = new Imployee("최강창민", 32, "회계");
//	
//	Student[] arr1 = {hong,park,son};
//	Teacher[] arr2 = {lee,kim};
//	Imployee[] arr3 = {choi};
//
//	for(Student s : arr1) {
//		System.out.println(s.info());
//	}
		
		
	//다형성 적용
		Person hong = new Student("홍길동",20,"123");
		Person park = new Student("박찬호",30,"234");
		Person son = new Student("손흥민",40,"222");
		
		Person lee=new Teacher("이승철", 123, "음악");
		Person kim=new Teacher("김우신", 43, "역사");
		
		Person choi  = new Imployee("최강창민", 32, "회계");
	
		Person[] arr = {hong,park,son,lee,kim,choi};
		
		for(Person p : arr) {
			System.out.println(p.info());
		}
		
		
		House h = new House();
		h.setIn(hong);
		h.setIn(park);
		h.setIn(son);
		h.setIn(lee);
		h.setIn(kim);
		h.setIn(choi);
		
		
	}

}

