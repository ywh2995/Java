package day04;

public class day04 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17};
		
		int i =0;
		int sum =0;
		while (i < arr.length) {
			sum += arr[i];
		i++;
		}System.out.println("합 : "+sum);

	}

}
