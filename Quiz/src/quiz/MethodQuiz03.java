package quiz;

public class MethodQuiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = java(5);
		System.out.println(str);

		System.out.println(sum(5));
		System.out.println("3까지의 소수 갯수 :"+primeNum(4));
	
		System.out.println("7~9:" +sumNum(7,9));
		System.out.println("10~9:" +sumNum(10,9));
		System.out.println("9~9:" +sumNum(9,9));
	
	
	}
	static String java(int a) {

		String s = "";
		for(int i=1;i<=a;i++) {
			s = i%2==0 ? (s+="바"): (s+="자");

		}
		return s;
	}
	static int sum(int a) {
		int s = 0;
		for(int i =1; i<=a;i++) {
			if(a%i==0) {
				s+=i;
			}
		}

		return s;
	}

	static int primeNum(int a) {
		int count = 0;
		int sosu = 0;
		for(int i =1; i<=a;i++) {
			count = 0;
			for(int j=1; j<=i;j++ ) {
				if(i%j==0) {
					count ++;
				
				if(count == 2) {
					sosu ++;
					break; 
					}
				}
			}
		}
		return sosu;	

	}
	static int sumNum(int a,int b) {
		
		if(a>b) {
			int sum = 0;
		for(int i=b;i<=a;i++) {
			sum+=i;
		}
		return sum;
		}else if(a<b) {
			int sum = 0;
		for(int i=a;i<=b;i++) {
			sum+=i;
		}
		return sum;
		}else {
			return a;
		}

}
		
	
	
	
	
}


