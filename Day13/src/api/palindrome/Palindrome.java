package api.palindrome;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		/*
		 * 아이티뱅크 친구 네오는 palindrome() 함수를 만듦
		 * - 매개변수로 String 값을 받아서 회문여부를 검사하는 메서드
		 * ex) 다시 합창 합시다, 아 좋다 좋아,다시다
		 * 
		 * 매개변수를 공백을 포함해서 받을 수 있습니다.
		 * 회문이라면 return 회문입니다 를 반환
		 * 회문이 아니라면 회문이 아닙니다 반환
		 * 
		 */

		System.out.println(palindrome("다시 합창 합시다"));

	}

	public static String palindrome(String str) {
		str = str.replace(" ","");
		int n =str.length()/2; 
		String result ="";
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				result = "회문이 아닙니다.";
			}else {
				result ="회문입니다"; 

		}
	}
	return result;




}

}


