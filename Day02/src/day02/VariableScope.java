package day02;

public class VariableScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num1 = 10;
		//int num2 = 20;
		int num1=10, num2=20;
		int num4 = 100;
		
		//변수는 해당 중괄호 안에서만 유효합니다.
		if(true) {
			int num3 = num1 + num2;
			num3 = num1;	
	
			num4 =20;
		}
		int num3 = 1000;
		System.out.println(num3);
		System.out.println(num4);
 	}

}
