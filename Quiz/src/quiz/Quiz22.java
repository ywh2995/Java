package quiz;

public class Quiz22 {

	public static void main(String[] args) {
		// 렌덤메소드 2~9
		// 구구단 출력
		
		int rd = (int) ((Math.random()*8)+2);
		
		for(int i = 1; i<=9;i++) {
			System.out.printf("%d x %d = %d\n",rd,i,(rd*i));
			
			
		}
		
	}

}
