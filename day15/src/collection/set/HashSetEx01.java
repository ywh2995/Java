package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashSet 객체 생성
//		HashSet<String> set = new HashSet<>();
		
		Set<String> set = new HashSet<>();
		
		//set에 추가add()
		set.add("JAVA");
		set.add("JSP");
		set.add("SPRING");
		set.add("ORACLE");
		set.add("JAVA"); // 중복 x
		
		//set에 저장된 크기 size()
		System.out.println("set 크기 : "+set.size());		
		System.out.println(set.toString());
		
		//set에 저장된 객체를 검색하려면, 반복자를 통해서 한번씩 확인해봐야 합니다.
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) { //다음에대한 조회
			System.out.println(iter.next()); //다음에 대한 접근
		}
		
		//set의 검색contains
		if(set.contains("JAVA")) {
			System.out.println("자바 인");
		}
		
		//set의 삭제 remove()
		set.remove("JAVA");
		System.out.println(set.toString());
		
		// set 
		
		
		
		
		
		
		
		
		
		
		
	}

}
