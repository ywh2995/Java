package quiz36;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {

	public static void main(String[] args) {
		/*
		 * scanner 통해 파일명 입력받기
		 * upload폴더에 파일이잇으면 해당파일을 uploadcopy로 복사
		 * 파일이없다면 파일명이 없다 예외구문 출력
		 * 
		 * 에러발생시 "파일처리중 예외바생"
		 */
		
		Scanner sc= new Scanner(System.in);
		
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		
		try { 
				System.out.println("파일명을 입력해주세요 :");
				String name = sc.next();
				oldFile =new FileInputStream("D:\\course\\java\\upload\\"+name);
				newFile = new FileOutputStream("D:\\course\\java\\uploadcopy\\"+name);
				int result;
				byte[] read=new byte[100];
				
				while((result = oldFile.read(read)) != -1) {
					newFile.write(read , 0, result );
					
				}
				
		
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			
		}catch(IOException e) {
			System.out.println("파일 처리중에러가 발생했습니다.");
		} finally {
			try {
				sc.close();
				oldFile.close();
				newFile.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
