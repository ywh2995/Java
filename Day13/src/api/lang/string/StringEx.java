package api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		String str = "안녕하세요~";
		//charAt - 문자열 인덱스번호 자르기
		char a =str.charAt(1);
		System.out.println(a);
		
		//indexOf - 문자열을 찾아서 인덱스를 반환
		int  i= str.indexOf("녕");
		System.out.println(i);
		
		//length
		System.out.println("길이 = "+str.length());
		
		//replace - 특정 문자열의 변경
		String str2 = "자바 재밌습니다. 자바는 커피집이름입니다.";
		String result =str2.replace("자바", "JAVA");
		
		result= result.replace(" ","");
		
		System.out.println(str2);
		System.out.println(result);
		
		//substring - 문자열 자르기
		String str3 = "123123-4564564";
		String result2 = str3.substring(7); //매개값 1개주면 앞문자열 제거
		System.out.println(result2);
		String result3 = str3.substring(7,str3.length()); // 추출
		System.out.println(result3);
		
		//trim = 앞 뒤 공백제거
		String str4 = "    홍 길 동";
		str4 = str4.trim();
		System.out.println(str4);
		
		
		//valueOf - 기본형을 문자열로 변경
		
		System.out.println(String.valueOf(3)+String.valueOf(4));
		String.valueOf(3);
		
		//split - 문자열 자르기
		String str5 = "010-1234-5678";
		String[] arr = str5.split("-");
		System.out.println(Arrays.
				toString(arr));
		
		String[] arr2 = str5.split("-",2 );
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
