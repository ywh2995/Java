package quiz40;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class RegexQuiz {

	public static void main(String[] args) {
		/*
		 * 1. day, store,grade,detail,price 를 멤버로 갖는 Product클래스 생성
		 * 2. getter,setter 선언
		 * 3. product를 제네릭으로 갖는 ArrayList생성
		 * 4. bufferedReader통해 건담.txt파일읽어들이기
		 * 5. while 문 안에서 leadLine 메서드 이용해서 한줄씩 읽어들임
		 * 6. 날짜 , 지점 , 등급 ,상세, 가격 패턴분석을 통해 product에 저장후 리스트에 추가 합니다.
		 * 
		 * 7. 외부라이브러리를 사용해서 분석한 패턴을 xlsx엑셀파일로 추출합니다.
		 * 
		 */

		List<Product> list = new ArrayList<Product>();
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\KG-ITBANK\\Desktop\\test4\\건담.txt")));
			String result;
			while( (result = br.readLine() )!= null) {
				Product product = new Product();


				String pattern1 = "\\d+-\\d+-\\d+";
				String pattern2 = " [가-힣]+ [가-힣]+\\점| [가-힣]+ [가-힣]+\\터미널";
				String pattern3 = "\\[[A-Z]+\\]|\\[[가-힣]+\\]";

				String pattern5 = "\\d+,*\\d+원";

				Matcher m1 = Pattern.compile(pattern1).matcher(result);
				Matcher m2 = Pattern.compile(pattern2).matcher(result);
				Matcher m3 = Pattern.compile(pattern3).matcher(result);
				Matcher m5 = Pattern.compile(pattern5).matcher(result);
				System.out.println(result);
				if(m1.find()) {
					product.setDay(m1.group());
				}
				if(m2.find()) {
					product.setStore(m2.group());
				}
				if( m3.find()) {
					product.setGrade(m3.group());
				}
				if (m5.find()) {
					product.setPrice(m5.group());
				}						

				String detail=result.substring(m3.end()+1,m5.start()-1);
				product.setDetail(detail);

				list.add(product);
			}

			list.forEach((stt)->System.out.println(stt.getDay()+stt.getStore()+stt.getGrade()+stt.getDetail()+stt.getPrice()));

		}catch (Exception e) {
			e.printStackTrace();
		}finally {

			try {
				br.close();

			} catch (Exception e) {

			}        
		}
		
		
		
		HSSFWorkbook wb= new HSSFWorkbook();
		HSSFSheet sh = wb.createSheet();
		HSSFRow row = sh.createRow(0);
		HSSFCell cell = null;
		
		
		cell = row.createCell(0); cell.setCellValue("날짜");
		cell = row.createCell(1); cell.setCellValue("지점");
		cell = row.createCell(2); cell.setCellValue("등급");
		cell = row.createCell(3); cell.setCellValue("디테일");
		cell = row.createCell(4); cell.setCellValue("가격");
		
		Product p;
		for(int rowIdx=0; rowIdx<list.size(); rowIdx++) {
			p = list.get(rowIdx);
			
			row = sh.createRow(rowIdx+1);
			
			cell = row.createCell(0);
			cell.setCellValue(p.getDay());
			
			cell = row.createCell(1);
			cell.setCellValue(p.getStore());
			
			cell = row.createCell(2);
			cell.setCellValue(p.getGrade());
			
			cell = row.createCell(3);
			cell.setCellValue(p.getDetail());
			
			cell = row.createCell(4);
			cell.setCellValue(p.getPrice());
		}
		File file = new File("C:\\Users\\KG-ITBANK\\Desktop\\test4\\test.xls");
		
		
		
		try {
			FileOutputStream fos =new FileOutputStream(file);
			wb.write(fos);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				wb.close();
				
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
		



	}
}






