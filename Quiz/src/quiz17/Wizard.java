package quiz17;

import quiz17.Player;

public class Wizard extends Player {
	// name 전달  hp=500,mp=1000,attack =20, armor=3
	
	Wizard(String name) {
		this.name =name;
		this.hp=500;
		this.mp=1000;
	
	}
	
	void iceArrow() {
	System.out.println("얼음화살 사용");	
	}
	
	void Blizzard(Player[] p) {
		
		for(Player s : p) {
			System.out.println("===================");
			System.out.println(this.name + "님의 눈보라 시전!");
			int rd = (int) ((Math.random()*6)+10);
			s.hp -= rd;
			System.out.println(s.name + "님이" + rd + "피해받음");
		}
	}
	

}
