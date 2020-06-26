package day06;

public class MethodEx01 {
	static int calum(){
		 // 클래스 안 메인밖 어디 서든 선어능
			int sum=0;
			for(int i =1; i<=100;i++) {
				sum+=i;
			}return sum;
		}

	
	static String randomStr() {
		String str="";
		for(char c= 'A'; c<='Z';c++) {
		str+=c;	
		}
		return str;
		 
	}
	
	static String randomStr2() {
		double rd = Math.random();
		
		String str = " ";
		if(rd>0.6) {
			return "가위";
		}else if(rd>0.33) {
			return "바위";
		}else {
			return"보";
		}
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		/*메인 밖에 ,클ㄹ 스 안 어디 서든 선어능
		* 메섯서드는 메서드 내부에 선언 x
		
		*/
		String result2 = randomStr();
		System.out.println("결과  :"+ result2);
		
		int sum=0;
		for(int i =1; i<=100;i++) {
			sum+=i;
		}
		System.out.println(calum());
	
		String random = randomStr2();
		System.out.println("가위바위보: "+random);
	
	
	}
	

}
