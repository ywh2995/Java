package quiz;

public class Quiz28 {

	public static void main(String[] args) {
	
		for(int i=1;i<=9;i+=3) {
						
			for(int j=1; j<=9; j++) {
				System.out.print(i+"x"+j+"="+j*i +"\t"+ 
						(i+1)+"x"+j+"="+(i+1)*j +"\t"+
						(i+2)+"x"+j+"="+(i+2)*j +"\n");
				
				}System.out.println();
			
			}
		
		}
	
}
