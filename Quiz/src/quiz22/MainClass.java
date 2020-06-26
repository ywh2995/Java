package quiz22;

public class MainClass {
	public static void main(String[] args) {
		
		Child c1 = new Child1(Price.RICE, Price.BULGOGI, Price.YOGURT, Price.ICECREAM, Price.MILK);
		System.out.println(c1.calculating());
		Child c2 = new Child2(Price.RICE, Price.BULGOGI, Price.YOGURT, Price.ICECREAM, Price.MILK);
		System.out.println(c2.calculating());
		Child c3 = new Child3(Price.RICE, Price.BULGOGI, Price.YOGURT, Price.ICECREAM, Price.MILK);
		System.out.println(c3.calculating());
		
		
	}
	
}
