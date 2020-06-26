package static_.method;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count count = new Count();
		count.a=10;
		count.method1();
		
		//static 메서드 사용
		Count.method2();
		Count.method2();
		
		//static 메서드의 예시
		Math.random();
		String.valueOf('c');
	
	}

}
