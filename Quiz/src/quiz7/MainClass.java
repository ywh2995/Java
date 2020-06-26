package quiz7;

public class MainClass {

	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		w1.name="나나나";
		w1.hp =1000;
		w1.mp = 100;
		w1.info();
		w1.bash();
		
		Wizard m1 = new Wizard();
		m1.name ="너너너";
		m1.hp = 500;
		m1.mp =1000;
		m1.info();
		m1.iceArrow();
	}

}
