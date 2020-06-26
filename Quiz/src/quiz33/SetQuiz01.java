package quiz33;

import java.util.HashSet;
import java.util.Set;

public class SetQuiz01 {

	public static void main(String[] args) {
		/*
		 * Random객체를 이용해서 1~45까지 랜덤수 생성
		 * set을 이용해서 6개 랜덤수를 만들어 내는 코드를 작성
		 */
		
		Set<Integer> set = new HashSet<>();
		
		while(set.size()!=6) {
			int rd = (int) (Math.random()*45+1);
			set.add(rd);
		}
		System.out.println(set.toString());
		System.out.println("==========================");
		for(int i=0;set.size()!=6;i++) {
			int rd = (int) (Math.random()*45+1);
			set.add(rd);
			
		}
		System.out.println(set.toString());
		
		
		
	}

}
