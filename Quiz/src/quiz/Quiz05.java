package quiz;

public class Quiz05 {
	public static void main(String[] args) {     
		//-5~5까지 랜덤값 만들고 0이라면 0출력 양수라면 양수, 음수라면 음수 출력
		int result = (int) (Math.random()*11)-5;
		System.out.println(result);
		
		String result2 = result > 0 ? "양수입니다" : "음수입니다";
		String result3 = result == 0 ? "0입니다" : result2;
		System.out.println(result3);
		
	
	}
}
