package quiz37;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RamdaQuiz01 {

	public static void main(String[] args) {
		List<Data> list = new ArrayList<Data>();
		List<Data> list2 = new ArrayList<Data>();
		/*
		 * 1.bufferedReader 사용해서 읽어들이세요
		 * 2."," 기준으로 잘라서 Data 클래스에 한줄 단위로 저장합니다.
		 * 3.list<Data> 추가
		 * 4.람다식을 이용해서, 지역은 서울 ,짝수 월의 분양가격 4000이상의 객체만 뽑아서 새로운 리스트 생성 
		 */
		BufferedReader br = null;
		try {
			
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\KG-ITBANK\\Desktop\\test4\\주택도시보증공사_전국 평균 분양가격(2020년 2월).csv"),"EUC-KR"));
			
			String result;
			Data data = new Data();
			while((result = br.readLine()) != null) {
				
				 String [] arr = result.split(",",5);
				 
				 
				
				 data.setRegion(arr[0]);
				 
				 data.setSize(arr[1]);
				 
				 data.setYear(arr[2]);
				 
				 data.setMonth(arr[3]);
				 
				 data.setPrice(arr[4]);
				 
				 list.add(data);
				 
		
				 
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch (Exception e) {
				
			}
		}
		
		list2 = list.stream().filter((str)->{
			
			return str.getRegion().equals("서울");  
		}).filter((str)->{
			int month = Integer.parseInt(str.getMonth());
			return month%2 ==0;
		}).filter((str)->{
			int price =Integer.parseInt(str.getPrice());
			return price >=4000;
		}).collect(Collectors.toList());
		
		
		
		list2.forEach((str)->System.out.println(str.getRegion()+","+str.getSize()+","+str.getYear()+","+str.getMonth()+","+str.getPrice()));
		
		
	}
}
