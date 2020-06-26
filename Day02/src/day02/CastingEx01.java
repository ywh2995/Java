package day02;

public class CastingEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 크기가 작은 타입을 큰 타입에 넣을 때는
		 * 자바 가상 머신 JVM 이 자동으로 형변환 해줍니다.
		 */
		
		byte b =10;
		
		short s = b; //byte -> short 자동형변환
		int i = b; //byte -> int
		long l =b; //byte -> long
		
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		char c = '가';
		int j = c; //char -> int
		
		System.out.println("가의 유니코드 값 : "+ j);
		
		int k = 1000;
		double d = k;
		
		System.out.println(d);
		
		
		
	}

}
