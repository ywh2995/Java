package api.io.stream01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {
		/*
		 * 1.파일을 읽어들이는데 사용하는 클래스는 fileinputStream 입니다.
		 * 2.생성자의 매개값으로 읽어들일 파일의 전체경로를 적습니다.
		 * 3.io 패키지의 모든 메서드 throws키워드가 있기 때문에 try~catch 안에서 사용
		 * 
		 * 
		 */

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("D:\\course\\java\\file\\ㅁㄴㅇ.txt");

//			while(true) {
//				
//				 
//				1byte씩 읽기
//				int data = fis.read();
//				System.out.print((char)data); //숫자형을 문자형으로 출력
//
//				if(data == -1) { //read 메서드가 더이상 읽을값이 없다면 -1반환
//					
//					break;
//				}
	
//			}
			byte[] arr = new byte[100];
			int result = fis.read(arr); //100바이트 단위로 읽음
			System.out.println(result);
//			System.out.println(Arrays.toString(arr));

			
			int i = 0;
			while(true) {
				if(arr[i]==0) break;
				
				System.out.print((char)arr[i]);
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
			}
			
			
		}


	}

}
