package quiz;

import java.util.Arrays;

public class Quiz26 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9}; // arr[8]
				
		for(int i =0; i<arr.length;i++) {
			int rd = (int)(Math.random()*arr.length);
//			int temp = arr[i];
			arr[i] = arr[rd];
//			arr[rd] = temp;
			}
		System.out.println(Arrays.toString(arr));
//		
//		
//		int [] arr2 = new int[3];
//		
//		for(int i=0; i<arr2.length;i++) {
//			arr2[i]=arr[i];
//		}
//		System.out.println(Arrays.toString(arr2));
//		
//		
		}
		
		
		
	}		

		
		
	

