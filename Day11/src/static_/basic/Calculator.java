package static_.basic;

public class Calculator {
	/*
	 * 계산기마다 색깔이나 결과값은 다를 수 있기에
	 * 일반 멤버 변수로 선언
	 * 
	 * 계산기마다 원주율은 동일하기에
	 * static 변수로 선언하는게 좋습니다.
	 * 
	 */
	private String color;
	private int result;
	
	public static double pi =3.14;
	
	/*
	 * 일반 멤버변수를 참조하는 메서드는 static
	 * 메서드가 되면 안됨
	 * 
	 * 
	 */
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	/*
	 * 메서드 내부에서 일반 메서드를 쓰지않고
	 * 범용성 있게 사용하는 메서드는 static키워드를
	 * 사용하는 편이 좋다.
	 */
	
	public static double circle(int r) {
		return r*r*pi;
		
	}
	public static double rect(int side) {
		return side*side;
	}
	
	public int getResult() {
		return result;
	}
	
	public int add(double a) {
		result += a;
		return result;
		
	}
	
	
	
	
}
