package api.io.rw03;

import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) {
		/*
		 * 문자 기반으로 읽어들이는 클래스는 fileReader클래스 입ㄴ;다.
		 * 2 바이트 단위로 읽기 때문에 문자를 쓰기에 적합
		 * 
		 */
		FileReader fr = null;
		
		try {
			fr = new FileReader("D:\\course\\java\\test.txt");
		
			while(true) {
				int i = fr.read(); // 문자를 하나씩 읽어들임
				System.out.print((char)i); //문자형으로 변환
				if(i==-1) { //읽어들일 문자가 없으면 -1 반환
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
