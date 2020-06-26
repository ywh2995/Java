package quiz;

public class Quiz27 {

	public static void main(String[] args) {
		
		// 2단부터 9단
		for(int i=1;i<=9;i++) {
			System.out.println(i+"단");
			for(int j=1;j<=9;j++) {
				System.out.println(i+" x "+ j + " = " + i*j);
			}
			System.out.println("===========\n");
		}

	}

}
