package api.util.token;

import java.util.StringTokenizer;

public class TokenEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String log = "2020.04.16 ,목요일 ,/bno=30,user = 홍길동;";

		StringTokenizer token1 = new StringTokenizer(log, ",");
		while (token1.hasMoreTokens()) {
			System.out.println(token1.nextToken());
		}

		//   ","  ,  "."  ,  "/" 기준으로 자름
		System.out.println("========================================");

		StringTokenizer token2 = new StringTokenizer(log,",./");

		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());

		}
		System.out.println("========================================");

		StringTokenizer token3 = new StringTokenizer(log,",",false);
		while(token3.hasMoreTokens()) {
			System.out.println(token3.nextToken());
		}
	}

}
