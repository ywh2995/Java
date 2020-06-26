package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListEx01 {
	
	public static void main(String[] args) {
		
//		Collection<String> list = new ArrayList<>();
//		ArrayList<String> list = new ArrayList();
		List<String> list = new ArrayList<>();
		
		
		// list 추가 add();
		list.add("JAVA");
		list.add("JSP");
		list.add("DB");
		list.add("SPRING");
		list.add("JAVA");
		
		//list의 크기 size()
		System.out.println("list 크기 : " + list.size());
		
		//list에 저장된 형태를 문자열로 확인 toString()
		System.out.println(list.toString());
		
		//list 중간에 추가 add(index,값)
		list.add(2, "ORACLE");
		System.out.println(list.toString());
		
		// list 값 수정 set(index,값)
		list.set(2, "MYSQL");
		System.out.println(list.toString());
		
		// list에 값 얻기 get(index)
		String value = list.get(2);
		System.out.println("2번째 인덱스의 값 :"+value);
		
		// list의 포함 여부 contains(값)
		if(list.contains("JSP")) { //jsp있다면 true 없다면 false
			System.out.println("JSP포함되어 있음");
		}
		
		// list 의 삭제 remove값, remove(index)
		list.remove(0);
		System.out.println(list.toString());
		
		list.remove("JSP");
		System.out.println(list.toString());
		
		////////////////////////////////////////////////////////
		
		List<String> list2=new ArrayList<String>();
		list2.add("홍길동");
		list2.add("홍길순");
		
		list.addAll(list2);
		
		System.out.println(list.toString());
		
		/////////////////////////////////////////////////////////
		String[] arr = {"이순신","신사임당"	};
		List<String> list3 = Arrays.asList(arr);// 배열로 바꿔주는역할
		
		list.addAll(list3);
		System.out.println(list.toString());
		
		
		
		
		
		
		
		
		
		
	}
}
