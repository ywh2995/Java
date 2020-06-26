package quiz;

import java.util.Arrays;

public class MethodQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();

		System.out.println(method2("ㅎㅎ"));

		System.out.println(method3(1,2,3));

		System.out.println(method4(4));		

		method5("메",5);

		System.out.println(maxNum(5,10));

		System.out.println(abs(5));

		System.out.println(method6(10));
		int [] a = new int[10];
		System.out.println(method7(a));

		System.out.println(Arrays.toString(method8("안녕","하이")));


		
		
	}
	static void method1() {
		System.out.println("안녕");
	}
	static String method2(String a) {
		return a;
	}
	static double method3(int a,int b,double c) {
		return a+b+c;
	}
	static String method4(int a) {
		if(a%2==0) {
			return "짝수입니다";
		}else{
			return "홀수입니다.";
		} 
	}
	static void method5(String a,int b) {
		for(int i =1;i<=b;i++) {
			System.out.println(a);
		}
	}
	static int maxNum(int a,int b) {

		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	static int abs(int a) {
		if(a<0) {
			return a*=-1;
		}else {
			return a;
		}
	}
	static int method6(int a) {
		int sum= 0;
		for(int i=0;i<=a;i++) {
			sum+=i;
		}return sum;
	}
	static int method7(int[] a) {
		return a.length;
	}
	static String[] method8(String a,String b) {
		String[] arr = {a,b};
		return arr;
	}

		



}




