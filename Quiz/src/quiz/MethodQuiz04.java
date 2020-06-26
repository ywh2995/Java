package quiz;

import java.util.Arrays;

public class MethodQuiz04 {
	public static void main(String[] args) {

		/*
		 * 1.크기가 6인 배열에 1~45까지 중복되지 않는 랜덤 수를 출력해서
		 * 반환하는 lottoNum() 메서드 생성
		 * 
		 * 2. lottoRun() 메서드는 1번에서 생성된 로또 번호를 매개변수로 받아서 당첨되기 까지 금액을 구하는 메서드
		 * 
		 * 랜덤한 로또 번호를 무한히 생성해서 , 매개변수로 전달 받은 변호와 비교해서
		 * 당점되기까지 실행된 금액을 반환
		 * 
		 * 당첨의 조건(순서는 상관없이 같은 번호만 배열에 담겨져 있다면 됩니다)
		 *  메서드안에서 메서드 호출
		 */
		int[] arr = lottoNum();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		long money = lottoRun(arr);
		System.out.println("당첨되기까지 사용한 금액 :"+money);



	}
	static int[] lottoNum() {
		int[] lotto = new int [6];
		for(int i =0;i<lotto.length;i++) {
			int rd = (int) ((Math.random()*45)+1);
			lotto[i] = rd;
			for(int j=0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					i -= 1;
				}

			}

		}return lotto;
	}

	static long lottoRun(int[] arr) {

		long count = 1;
		Arrays.sort(arr);
		while(true) {
			
			int[] arr2 = lottoNum();
			Arrays.sort(arr2);
			if(Arrays.equals(arr, arr2)) {
				return count * 1000;
			}else {
				count++;
			}
			
		}
		
	}


}
