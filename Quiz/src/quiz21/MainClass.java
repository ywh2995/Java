package quiz21;

public class MainClass {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		Marine m4 = new Marine();

		Tank t1 = new Tank();
		Tank t2 = new Tank();
		
		DropShip d = new DropShip();
		
		System.out.println( "=========Marine=========");
		m1.location();
		m1.move(3, 4);
		m1.move(4, 12);
		
		System.out.println( "============Tk=============");
		t1.location();
		t1.move(4, 5);
		t1.move(5,3);
		
		System.out.println("============DropShip============");
		System.out.println("타고있는 유닛");
		d.ride(t1);
		d.ride(m2);
		d.ride(m3);
		d.ride(t1);
		d.ride(t2);
		
	
		
		
		
	}

}
