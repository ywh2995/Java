package quiz39;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		/*
		 * 가격 형식만 찾아서 순서대로 출력해보세요
		 * ex~~~원
		 * 
		 */
		// *는 0회 이상반복 : 있어도 되고 없어도 되는경우
		
		String str = "20180311-01-0079201803112 건담베이스 부천점 [스탠드] HACO ROOM 꼬마곰 재키 키트 1 15,500원";
		
//		String pattern ="\\d,*\\d+원";
//		String pattern = "[0-9]+,*[0-9]+원";
//		String pattern = "\\d{1},\\d{1,3}\\W|\\d{1,6}\\W";
		String pattern1 = "\\d+-\\d+-\\d+";
		String pattern2 = "[가-힣]+ [가-힣]+\\점";
		String pattern3 = "\\[\\w[A-Z]\\]|\\[\\W[가-힣]+\\]";
		String pattern4 = "\\";
		String pattern5 = "\\d,\\d+\\원";
		

//		Matcher m1 = Pattern.compile(pattern1).matcher(str);
//		Matcher m2 = Pattern.compile(pattern2).matcher(str);
//		Matcher m3 = Pattern.compile(pattern3).matcher(str);
//		Matcher m4 = Pattern.compile(pattern4).matcher(str);
		Matcher m5 = Pattern.compile(pattern5).matcher(str);
		
//		System.out.println(m1.group());
		while(m5.find())
//		System.out.println(m2.group());
//		System.out.println(m3.group());
//		System.out.println(m4.group());
		System.out.println(m5.group());
		
		
		
	}

}
