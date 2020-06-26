package quiz22;

public class Child3 extends Child{

	public Child3(int rice, int bulgogi, int yogurt, int icecream, int milk) {
		super(rice, bulgogi, yogurt, icecream, milk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculating() {
		
		return rice+bulgogi+icecream;
	}

}
