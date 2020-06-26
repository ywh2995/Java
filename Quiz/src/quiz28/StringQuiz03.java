package quiz28;

import java.util.Scanner;

public class StringQuiz03 {

public static void main(String[] args) {
	System.out.println(palindrome("다사다"));
}
	
	public static String palindrome(String str) {
		str = str.replace(" ","");
		StringBuffer sb =new StringBuffer(str);
		sb.reverse();
		
return  str.equals(sb.toString())? "회문입니다" : "회문이아닙니다";

}
	

}


