package day07;

public class PenMain {

	public static void main(String[] args) {
		// Pen의 기능 속성을 쓰려면 설계용 클래스를 객체로 생성해야함.
		// 객체의 기능과 속성을 사용할때는 참조연산자.을 사용합니다.
		Pen black = new Pen();
		black.company = "모나미";
		black.ink = "검정";
		black.price = 500;
		black.write();
		black.info();
		
		Pen red = new Pen();
		red.company ="모나미";
		red.ink = "빨강";
		red.price =500;
		
		red.write();
		red.info();
	}

}
