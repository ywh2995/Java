package api.io.buffered04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {

		FileWriter fw = null;
		BufferedWriter bw = null;
		
		Scanner sc= new Scanner(System.in);
		try {
			/*
			 * 순서대로 nextLine을 써서 두 문장을 입력 받고 줄바꿈 처리
			 * file 폴더안에 text3.txt형식으로 파일을 쓰세여
			 * 
			 * 
			 */
			System.out.print("문장을 입력하세요 :");
			String str1 = sc.nextLine();
			System.out.print("문장을 입력하세요 :");
			String str2 = sc.nextLine();
			fw = new FileWriter("D:\\course\\java\\file\\text3.txt");
			bw = new BufferedWriter(fw);
			
			bw.write(str1+"\n");
			bw.write(str2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
				
			}
		}
		
	}

}
