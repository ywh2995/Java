package quiz20;

public class Rect extends Shape{

	// 사각형은 생성될 때 이름과 변의 길이를 받도록 , getArea 는 사각형 넓이 계산 하도록 오버라이딩
	// 메인 확인
	private int side;
	public Rect(String name,int side) {
		super(name);
		this.side = side;

	}


	public double getArea() {

		return side * side;
	}
	


}
