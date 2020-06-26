package api.io.buffered04;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx {

	public static void main(String[] args) {
		/*
		 * Buffered가 붙은 클래스는 입출력 속도 향상을 위한 클래스 이며 InputStream은 바이트기반
		 */

		FileInputStream fis = null;
		BufferedInputStream bis=null;

		try {
			fis = new FileInputStream("D:\\course\\java\\file\\text2.txt");
			bis = new BufferedInputStream(fis);
			
			while(true) {
			int a = bis.read();
			System.out.print((char)a);
			if(a ==-1) { 
				break;
			}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
