package quiz9;

public class MainClass {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(1);
		System.out.println("call의 누적값 :"+cal.result);
		cal.add(2,3);
		System.out.println("call의 누적값 :"+cal.result);
		cal.add(1,2,3);
		System.out.println("call의 누적값 :"+cal.result);
		cal.add(1,2,3,4);
		System.out.println("call의 누적값 :"+cal.result);
		
		ArrayPrint ap = new ArrayPrint();
		
		String[] arr = {"홍길동","홍길자","이순신"};
		int[] arr2 = {1,2,3,4,5};
		char[] arr3 = {'가','나'};
		
		
		System.out.println(ap.printArray(arr));
		System.out.println(ap.printArray(arr2));
		System.out.println(ap.printArray(arr3));
	}

}

