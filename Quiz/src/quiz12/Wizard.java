package quiz12;

public class Wizard extends Player {
	// name 전달  hp=500,mp=1000,attack =20, armor=3
	
	Wizard(String name) {
		this.name =name;
		this.hp=500;
		this.mp=1000;
		this.attack = 5;
		this.armor = 2;
	}
	
	
	void iceArrow() {
	System.out.println("얼음화살 사용");	
	}

	

}

