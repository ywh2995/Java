package quiz;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = (int) (Math.random()*100)+1;
		System.out.println(result);
		
		String result2 = result %2==0 ? "짝수입니다" : "홀수입니다";
		System.out.println(result2);
	
	
	}

}
