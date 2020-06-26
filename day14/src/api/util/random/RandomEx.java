package api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		
		int x = rd.nextInt();
		System.out.println(x);// int 범위까지 랜덤수
		 
		int x1 = rd.nextInt(100)+1; //1~100까지랜덤수
		System.out.println(x1);
		
		double y  = rd.nextDouble();
		System.out.println(y); // 0~1.0까지 실수범위 
		
		
	}

}
