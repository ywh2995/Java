package generic.basic01;

public class MainClass {
	
	public static void main(String[] args) {
		
		//제네릭 사용시 , 객체 생성할때 사용할 타입을 지정가능
		// 다양한 값을 저장하도록 생성가능
		
		ABC<String> abc = new ABC<>(); //생성자의 타입은 생략가능
		
		abc.setT("홍기자");
		String name = abc.getT();
		
//		ABC<int>abc2 = new ABC<int>(); // 제네릭에는 기본형이 저장될 수 없습니다.
		ABC<Integer>abc2 = new ABC<Integer>();
		
		abc2.setT(1);
		int num = abc2.getT();
		
		ABC<Person>abc3 = new ABC<>();
		
		abc3.setT(new Person());
		Person p = abc3.getT();
		
		
		
	}
}
