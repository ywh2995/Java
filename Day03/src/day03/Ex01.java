package day03;

public class Ex01 {

	public static void main(String[] args) {

		int a = 1; // 제어변수 : 반복문의 횟수를 제어할 변수
		int sum = 0;
		while (a <= 10) {
			sum += a;
			a++;
		}
		System.out.println(sum); // 누적값은 반복문 밖에 배치

		
	}

}
