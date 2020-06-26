package static_.basic;

public class MainClass {
	public static void main(String[] args) {

		/*
		 * 1. 녹색, 빨강색 계산기를 각각 생성
		 * 2. 계산기 색상을 확인
		 * 3. add(int a)메서드 추가
		 * 4. 계산기 result 값도 확인
		 * 5. static 메서드 pi,circle 사용해서 원의넓이 구하기
		 */

		Calculator c1 = new Calculator();
		c1.setColor("녹색");
		System.out.println(c1.getColor()+" 계산기");
		Calculator c2 = new Calculator();
		c2.setColor("빨강색");
		System.out.println(c2.getColor()+" 계산기");

		c1.add(1);
		c2.add(20);
		System.out.println(c1.getColor() + "의 결과값은 :"+c1.getResult());
		System.out.println(c2.getColor() + "의 결과값은 :"+c2.getResult());

		System.out.println("원의넓이 :"+ c1.add(Calculator.circle(10)));
		System.out.println("사각형 넓이 : "+ c2.add(Calculator.rect(4)));
		
		
		System.out.println("======================================");
		
		int[] arr = {1,2,3,4,5};
		System.out.println(ArrayPrint.printArray(arr));
		
		
		
		
	}
}	
