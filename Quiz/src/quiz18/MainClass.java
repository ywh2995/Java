package quiz18;

public class MainClass {

	public static void main(String[] args) {
	MyCart p1 = new MyCart(1000);
	Tv t = new Tv();
	Radio r = new Radio();
	Computer c = new Computer();
	p1.buy(t);
	p1.buy(r);
	p1.buy(c);
		
	}

}
