package api.io.stream01;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamCopy {

	public static void main(String[] args) {

		FileInputStream oldFile = null;
		FileOutputStream newFile = null;

		try {
			oldFile = new FileInputStream("D:\\course\\java\\workspace2\\day16\\src\\api\\io\\stream01\\1.png");//읽을 경로
			newFile = new FileOutputStream("D:\\course\\java\\file\\copy.png"); //복사할 경로

			byte[] arr = new byte[150];

			int i = 0;
//			while(true) {
//				int result = oldFile.read(arr); //읽어들인 크기가 있다면 읽은 데이터 길이를 반ㅇ환하고, 없다면 -1 반환
//
//				if(result == -1) {
//					break;
//				}
//				newFile.write(arr,0,result); // 바이트 단위로 0~ 읽은 크기까지 파일씀
//
//			}	
			int result ;
			while( (result = oldFile.read(arr) ) != -1) {
				newFile.write(arr,0,result);
			}
			
			
			
			System.out.println("파일이 정상적으로 복사되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}	finally {
			try {
				oldFile.close();
				newFile.close();
			} catch (Exception e2) {
				
			}
		}

	}

}
