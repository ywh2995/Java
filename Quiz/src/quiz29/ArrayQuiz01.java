package quiz29;

import java.util.Arrays;

public class ArrayQuiz01 {

	public static void main(String[] args) {
		
		String[] start = {"홍길동","홍길자","이순신","신사임당","이순신"};
		String[] end = {"홍길동","홍길자","신사임당","이순신"};
		
		System.out.println("완주하지못한 사람 : "+ solution(start,end));
		
		
	}
	
	public static String solution(String[] a,String[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		String [] arr = Arrays.copyOf(a, a.length-1);
		String result = "";
		if(!Arrays.equals(arr,b)) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==b[i]) {
					 result= arr[i];
				}
			}
			 
			}
		return result;
		
			
		}

 
}
		



