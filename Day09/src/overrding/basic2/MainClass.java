package overrding.basic2;

public class MainClass {

	public static void main(String[] args) {
	
		Parent p = new Parent();
		p.method1();
		p.method2();

		System.out.println("---------------------");
		
		Child c = new Child();
		
	}

}
