package ramda.basic;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.greeting(new Say01() {@Override
		public void talking() {
			
		System.out.println("안녕하세요~");
			
		}
	});
		p.greeting(new Say02() {
			@Override
		public String talking() {
		System.out.println("Hello");
			return "Hello";
		}
		});
		
		p.greeting(new Say03() {
			
			@Override
			public String talking(String greet) {
				System.out.println(greet );
				return greet;
			}
		});
		
	
		System.out.println("---------------------------------------");
		
		//익명개체  
		
		
		p.greeting(() -> {
			System.out.println("ㅎㅇ");
		});
		p.greeting ( () ->{
			System.out.println("Heeloo");
			return "hello";
		});
		p.greeting((greet)->{
			System.out.println(greet);
			return greet;
		});
		String result2 = p.greeting((word,i)->{
			
			String result = "";
			for(int j =1;j<=i;j++) {
				result +=word;
			}
			return result;
		});	
		System.out.println(result2);
}
}
