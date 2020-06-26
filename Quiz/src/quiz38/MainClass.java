package quiz38;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
	static int sum; 

	public static void main(String[] args) {
		List<Data> list = new ArrayList<Data>();
		List<Data> list2 = new ArrayList<Data>();
		/*
		 * 1. BufferedReader를 통해서 파일을 읽어 들이세요
		 * 2. 수출입 구분의 "수출" 항목의 품명 "갈치"가 포함되 있는 데이터만 구분해서 list<data>에 처리
		 * 3. 이 데이터의 수출입 미화금액 총합계를 구하시오
		 * 
		 * if(data.indexof("갈치") != -1)
		 */
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\KG-ITBANK\\Desktop\\test4\\해양수산부_수산물 품목별 수출입 현황 - 2020년 02월(월간).csv"),"EUC-KR"));
			String result;
			
			while((result = br.readLine()) != null) {
				Data d = new Data();
				String [] arr = result.split(",",10);
				
				
				d.setIo(arr[4].replace("'", ""));
				
				d.setProduct(arr[3].replace("'", ""));
				d.setPrice(arr[6].replace("'",""));
				
				
				
				list.add(d);
				
			}
			
			
			list2 =list.stream().filter((str) -> {
				
				return  str.getIo().equals("수입");
					
			}).filter((str)->{
				return str.getProduct().indexOf("오징어") != -1;
			}).collect(Collectors.toList());
					
			
			list2.forEach((str)->sum += Integer.parseInt(str.getPrice()));
			System.out.println(sum+"원");
			
			
			
		}catch (Exception e) {
		e.printStackTrace();
		}
		
	}

	

}
