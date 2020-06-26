package day03;

public class IfEx01 {

	public static void main(String[] args) {
		// 0~100 정수 랜덤
		int rd =(int) (Math.random()*101);

		System.out.println("점수 :" + rd);

		if (rd>=60) {
			System.out.println("60점이상 입니다");
			System.out.println("축하합니다.");
		}else {
			System.out.println("60점미만 입니다");
			System.out.println("불합격입니다.");
		}
	}

}
