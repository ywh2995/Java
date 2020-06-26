package exception.trycatch;

public class TryCatchEx02 {
	public static void main(String[] args) {
		String[] greeting = {"홍길동","홍길자","이순신"};
		int i=0;
		while(i<4) {

			try {

				System.out.println(greeting[i]);

			} catch(Exception e) {
				System.out.println("범위 벗어남");
			}finally {
				System.out.println("예외 여부 관계없이 항상 출력");
			}
			i++;
		}
		System.out.println("프로그램 정상 종료");
		
	}
}
