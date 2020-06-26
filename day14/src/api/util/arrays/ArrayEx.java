package api.util.arrays;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8};
		
		// 배열의 정렬 
		Arrays.sort(arr);
		
		// 배열의 검색 (선행조건 : 오름차순정렬)
		int index = Arrays.binarySearch(arr, 10);		
		System.out.println("5가있는 위치 : "+index);
		
		int index2 = Arrays.binarySearch(arr, 123);
		System.out.println(index2); 
		
		// 배열복사
		int[] copyArr = Arrays.copyOf(arr, arr.length);
		
		// 배열문자열로 확인
		System.out.println(Arrays.toString(copyArr));
		
		// 배열복사
		int[] copyArr2=Arrays.copyOfRange(arr,3,arr.length);
		System.out.println(Arrays.toString(copyArr2));
		
		if(Arrays.equals(arr, copyArr)) {
			System.out.println("배열요소가 똑같다");
		}
		else System.out.println("다르다");
		
	}

}
