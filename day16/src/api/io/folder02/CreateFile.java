package api.io.folder02;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		/*
		 * 자바에서 외부경로로 폴더를 생성할 때는 file 클래스를 사용합니다.
		 * 생성자의 매개변수로 폴더를 생성할 경로 + 폴더명을 지정합니다.
		 * 
		 */
		
		try {
			File file = new File("D:\\course\\java\\file_text");
			if(!file.exists()) { // 존재하면 true 존재하지않으면 false
				file.mkdir(); //파일 생성
				System.out.println("폴더생성완료");
			}
			else {
				System.out.println("해당 폴더가 존재합니다.");
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
