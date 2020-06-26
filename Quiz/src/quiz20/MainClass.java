package quiz20;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r = new Rect("정사각형",5);
		System.out.println(r.getName());
		System.out.println("넓이는 :"+r.getArea());
		
		Circle c = new Circle("원", 4);
		System.out.println(c.getName());
		System.out.println("넓이는 :"+ c.getArea());
		
	}
	

}
