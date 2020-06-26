package inter_.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		//1.animal[] 생성 후  d c t 저장 후
		//향상포문으로 animal 공통 ㄱ능 출력
		
//		2.IPet[] 생성후 d c 금붕어 저장 후 향포문 출력
		
		Animal[] arr = {dog, cat,tiger};
		
		for(Animal a : arr) {
			a.eat();
		}
		
		IPet[] ip = {(IPet) dog,(IPet) cat,new GoldFish()};
		for(IPet p : ip) {
			p.play();
		}
		
		PetHouse ph = new PetHouse();
		ph.carePet((IPet) dog);
		ph.carePet(new GoldFish());
		ph.petInfo(ip);
	}

}
