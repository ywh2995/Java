package api.io.rw03;

import java.io.FileWriter;

public class FileWriterEx {

	public static void main(String[] args) {

		/*
		 * 문자를 써서 저장할 때 사용하는 클래스는 FileWriter클래스 입니다.
		 * 기본적응로 2바이트 단위 처리 하기 에 문자 쓰기에 적합
		 */
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("D:\\course\\java\\test.txt");
			String str = "집에\n가고싶다"; // \n 줄바꿈 \r 커서처음으로 옮김
		
			fw.write(str);
			
			System.out.println("정상저장");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				
			}
			
		}
		
	

	}

}
