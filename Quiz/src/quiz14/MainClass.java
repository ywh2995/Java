package quiz14;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperSonicAp s = new SuperSonicAp("z기");
		System.out.println(s.info());
		s.takeOff();
		s.fly();
		s.flyMode =1;
		s.fly();
		s.land();
	}        

}
