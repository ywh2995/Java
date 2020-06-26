package quiz;

public class Quiz04 {
	
	public static void main(String[] args) {
		
	
	// 1~150 랜덤정수 발생시키고 사과의 개수라고 가정
	// bucket은 사과를 담을 수 있는 바구니
	// 필요한 바구니 개수를 구하세여
	int bucket=10;
	
	int result = (int) (Math.random()*150)+1;
	int result2 = result / bucket;
	int result3 = result % bucket !=0 ? result2 + 1 : result;
	System.out.println("사과갯수는 :" + result);
	System.out.println("필요한 바구니 갯수는 :"+ result3);
	
	}
}
