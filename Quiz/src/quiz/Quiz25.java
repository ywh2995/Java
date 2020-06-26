package quiz;

public class Quiz25 {

	public static void main(String[] args) {
		// 1. 100 크기 배열에 3 의배수 저장
		
		
		int[] arr = new int[100];
		int a = 0;
		for(int i=0; i<arr.length; i++) {	
			
				arr[i]= (a+=3);
				System.out.printf(arr[i]+" ");
			}
		}
		
	}


