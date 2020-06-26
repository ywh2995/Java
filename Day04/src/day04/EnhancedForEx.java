package day04;

public class EnhancedForEx {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};

		for(int i :arr) {
			System.out.print(i);
		}
		System.out.println("\n=======================================");
		
		String[] arr2 = {"월","화","수","목","금","토","일"};
		
		for( String a: arr2) {
			System.out.print(a);
		}
		
		System.out.println("\n=======================================");

		int[] score = {33,55,45};
		int sum = 0;
		
		for(int s : score) {
			sum += s;
		}
		System.out.println("합계 :" +sum);
		double avg = ((double)sum/score.length);	
		System.out.println("평균:" +(double)sum/score.length);
		System.out.printf("평균: %.2f\n", avg);
		System.out.println("평균 :" + (int)(avg*100)  /100.0);
	}

}
