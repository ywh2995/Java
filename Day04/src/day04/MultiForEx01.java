package day04;

public class MultiForEx01 {

	public static void main(String[] args) {
		
//		for(int i=1; i<=9; i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+"_" + j);
//			}
//		
//		}

		
		for(int i=1;i<=9;i++) {
			System.out.println(i+"단");
			for(int j=1;j<=9;j++) {
				System.out.println(i+" x "+ j + " = " + i*j +"\n");
			}
			System.out.println("===========\n");
		}
		
	}

}
