package api.io.buffered04;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BufferedOutputStreamEx {
	public static void main(String[] args) {
		/*
		 * Buffered가 붙은 클래스는 입출력 속도향상을 위한 클래스이며 OutputStream이며
		 * byte 기반
		 * 
		 * Buffered가 붙은 클래스들은 생성자의 매개변수로 바이트 기반 클래스를 받을수 있습니다.
		 */
		Scanner sc = new Scanner(System.in);
		FileOutputStream fs = null;
		BufferedOutputStream bs = null;
		
		try {
			fs = new FileOutputStream("D:\\course\\java\\file\\text2.txt");
			bs = new BufferedOutputStream(fs);
			
			System.out.print("문장을 입력하세요 >");
			String str = sc.nextLine();
			
			bs.write(str.getBytes()); //write()는 매개변수로 바이트 배열을 받습니다.
//			bs.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bs.close(); //bs가 닫힐때 자동 flush()가 호출됩니다.
				fs.close();
				sc.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
