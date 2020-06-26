package inter_.basic3;

public class MainClass {
	
	public static void main(String[] args) {
		
		Printed p = new LG();
		p.turnOn();
		p.print("마바사");
		p.colorPrint("가나라다", "검정");
		p.copy(10);
		p.turnOff();
		
		System.out.println("================================");
			
		Printed p1 = new Samsung();
		p1.turnOn();
		p1.print("마바사");
		p1.colorPrint("가나라다", "검정");
		p1.copy(10);
		p1.turnOff();
	}
}
