package regex.pattern;

public class RegexEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info="홍길자|30세|서울시 강남구|010-1234-1234";
		//전화번호 형식만 찾아서 ***로 변경하세요

		String result = info.replaceAll("010-1234-1234","***-***-***");
		System.out.println(result);
	}

}
