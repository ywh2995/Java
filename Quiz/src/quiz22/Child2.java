package quiz22;

public class Child2 extends Child {

	public Child2(int rice, int bulgogi, int yogurt, int icecream, int milk) {
		super(rice, bulgogi, yogurt, icecream, milk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculating() {
		
		return rice+bulgogi;
	}

}
