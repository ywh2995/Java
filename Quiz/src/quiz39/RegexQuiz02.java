package quiz39;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		/*
		 * 상품번호, gs25,(치킨도시락),가격으로 분리해서 출력
		 * 
		 */
		String str = "123123-4564564 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453453 GS25(마늘햄쌈) 5,000원";

		String pattern = "\\d+-\\d+";
		String pattern2 = "\\(\\W+\\)";
		String pattern3 = "\\d,\\d+원";
		String pattern4 = "\\w[A-Z]\\d[2-5]";

		String[] arr= {str,str2};

		int i =0;
		while(i<arr.length) {
			Matcher m1 = Pattern.compile(pattern).matcher(arr[i]);
			Matcher m2 = Pattern.compile(pattern2).matcher(arr[i]);
			Matcher m3 = Pattern.compile(pattern3).matcher(arr[i]);
			Matcher m4 = Pattern.compile(pattern4).matcher(arr[i]);

			if(m1.find() &&m2.find() && m3.find() &&m4.find()) {
				System.out.println(m1.group());
				System.out.println(m2.group());
				System.out.println(m3.group());
				System.out.println(m4.group());
			}
			System.out.println();

			i++;
		}
	}
}


