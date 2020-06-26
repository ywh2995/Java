package quiz22;

public abstract class Child extends Price{
	
	public int rice;
	public int bulgogi;
	public int yogurt;
	public int icecream;
	public int milk;
	
	public Child(int rice, int bulgogi, int yogurt, int icecream, int milk) {
		super();
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.yogurt = yogurt;
		this.icecream = icecream;
		this.milk = milk;
	}
	
	public abstract int calculating();
}
