package test5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test5 {
	
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader rw = null;
		
		
		
		
		try {
			fr = new FileReader("C:\\Users\\KG-ITBANK\\Desktop\\test4\\2020420.csv");
			rw = new BufferedReader(fr);
			
			String result;
			while((result = rw.readLine())!=null) {
				
				System.out.println("["+result+"]");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				rw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}	
