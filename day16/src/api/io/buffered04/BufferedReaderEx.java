package api.io.buffered04;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {
	
	public static void main(String[] args) {
		
		 BufferedReader br = null;
		 FileReader fr = null;
				 
		 try {
			 fr = new FileReader("D:\\course\\java\\file\\text3.txt");
			 br = new BufferedReader(fr);
			 String result;
			 //BufferedReader에는 readLine()메서드가 있고, 한줄을 통째로 읽는다. 
			 while((result = br.readLine()) !=null ){
			 System.out.println(result);
			 }
			 
		 }catch (Exception e) {
			 e.printStackTrace();
			 
		}finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				
			}
		}
	
	}
}
