package day06;
public class MethodEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * 매개변수(parameter)
			 * 1.매개변수는 메서드 호출할 때 실행에 필요한 값을 전달하는 매개체이비다.
			 * 2.매개변수는 몇개 받을지는 메서드를 선언할 때 결정
			 * 3.매개변수 여려개 받으려면 ',' 로 연결 하면 됩니다.
			 * 4.매개변수를 받지않는다면 소괄호를 비워두면 됩니다.
			 */
		int a =10;
		int b =10;
	System.out.println(calSum2(a>10?5:10,20));
		
	System.out.println(calSum(12));
	System.out.println(calSum3(1,10,"가"));
	String result2 = calSum3(1,10,"가");
	System.out.println("결과 : " + result2);
	
	}
	static int calSum(int a) {
		int sum=0;
		for(int i=1;i<=a;i++) {
			sum+=i;
		}
		return sum;
	}
	static int calSum2(int start,int end) {
		
		int sum=0;
		for(int i = start; i<=end; i++) {
			sum+=i;
		}return sum;
	}
	
	static String calSum3(int start,int end,String s) {
		String str = "";
		for(int i=start; i<=end; i++) {
		str += s;
		}
		return str;
	}
	
	
	
}
