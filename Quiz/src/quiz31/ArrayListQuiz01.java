package quiz31;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQuiz01 {

	public static void main(String[] args) {
		// list에 1~20까지 정수 저장
		
		// 저장한 값을 반복문으로 출력
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1;i<=20;i++) {
			list.add(i);
		}
		for(int j=0;j<20;j++) {
			Integer result = list.get(j);
				System.out.println(result);
		}
		
		
	}
}
