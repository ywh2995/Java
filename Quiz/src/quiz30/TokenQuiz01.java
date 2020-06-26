package quiz30;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {

	public static void main(String[] args) {
		/*
		 *  nextLine()ㅇ문장 입력
		 *  2. 입력된 문자열을 토그나이저를 이용해서 공백기준으로 분리
		 *  3. 분리한 토큰의 개수 출력
		 *  4. 븐리된 토큰을 콘솔에 숫자를 붙여서 세로로 출력
		 *  1. 안녕 
		 *  2. 하세요ㅕ
		 *  3. 오늘은
		 *  5. 분리된 문자열을 배열에 저장
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장입력 : ");
		String ans = sc.nextLine();
		StringTokenizer answer = new StringTokenizer(ans);
		System.out.println("분리한 토근의 개수 :" +answer.countTokens()+"개");
		String[] arr = new String[answer.countTokens()];
		int i = 0;
		while(answer.hasMoreTokens()) {
			arr[i]=answer.nextToken();
			System.out.println((i+1)+"."+arr[i]);
			i++;
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
