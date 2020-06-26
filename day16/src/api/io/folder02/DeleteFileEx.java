package api.io.folder02;

import java.io.File;

public class DeleteFileEx {
	
	public static void main(String[] args) {
		try {
			File file = new File("D:\\course\\java\\file_text");
			if(file.exists()) {
				file.delete(); //delete 성공시 true 실패시 false 반환
				System.out.println("파일삭제성공");
			}else {
				System.out.println("실패");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
