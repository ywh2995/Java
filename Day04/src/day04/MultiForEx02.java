package day04;

public class MultiForEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star =5;
		for(int i=0; i<star;i++) {
			for(int j=0;j<=i ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=========");
		
		
		for(int i=0;i<star;i++) {
			for(int j=0;j<star-i ;j++) {
				System.out.print("*");
				
			}System.out.println();
		}
		
		System.out.println("==========");
		for(int i=0;i<star;i++) {
			for(int j=star;j<4;j--) {
			System.out.println("*");	
			}
			System.out.println();
		}
		System.out.println("=============");
		for(int i=0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
				
			}for(int k=0; k<2*i+1;k++) {
			System.out.print("*");
			}
			System.out.println();
		}

		
	}

}
