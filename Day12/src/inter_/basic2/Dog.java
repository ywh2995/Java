package inter_.basic2;

public class Dog extends Animal implements IPet{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
			System.out.println("강아지 사료먹엉");
	}
	 @Override
	public void play() {
		// TODO Auto-generated method stub
		 System.out.println("강아지 띄어논다");
	}
}
