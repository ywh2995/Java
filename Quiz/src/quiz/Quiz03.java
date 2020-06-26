package quiz;

public class Quiz03 {
	public static void main(String[] args) {
		int result = (int) (Math.random()*11)-5;
		System.out.println(result);
		
		int result2 = result < 0 ? result*-1:result; 
		System.out.println("절대값은 "+result2);
	}
}
