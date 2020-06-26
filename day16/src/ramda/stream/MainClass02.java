package ramda.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.crypto.Data;

public class MainClass02 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for(int i=0;i<100;i++) {
			list.add(new Random().nextInt(100)+1);

		}

		System.out.println(list.toString());

		System.out.println("====================================================");

		// 중복제거 distinct()
		list.stream().distinct().forEach( (num) -> System.out.print(num+" "));
		System.out.println();

		System.out.println("====================================================");

		//걸러내는 기능 filter()
		Stream<Integer> s1=list.stream().filter( (num) -> {
			return num%2==0;
		});
		s1.forEach((num)->System.out.print(num + " "));

		System.out.println("\n====================================================");
		
		//정렬 sorted()
		list.stream().sorted().distinct().forEach((num)-> System.out.print(num+" "));
		
		System.out.println("\n====================================================");
		
		//map() 메서드 안에 정의된 새로운 stream으로 반환
		Stream<String> s2=list.stream().map( (num)->{
			
			return num%2==0?"짝수":"홀수";
		});
		s2.forEach((str)->System.out.print(str+" "));
		System.out.println("\n====================================================");
		
		List<Integer> result = list.stream().filter((num)->{
			return num%3==0;
		}).collect(Collectors.toList());
		
		System.out.println(result.toString());

		System.out.println("\n====================================================");
		// list의 중복을 제거하고 짝수만 찾아낸 후 정렬 후 짝홀수로 변경한 결과를 list로 반환받고 forEach구문으로 돌리시오
		
		list.stream().filter((num)->{return num%2==0;}).sorted().map((num)->{return num%2==0? "짝수":"홀수";}).collect(Collectors.toList()).forEach((num)->System.out.print(num+" "));
		
		
	}


}
