package quiz17;

import quiz17.Player;

public class Warrior extends Player{
	// name은전달받아서 초기화 , hp = 1000, mp = 500,attack=10,armor=5 
	
		Warrior(String name) {
		this.name =name;
		this.hp=1000;
		this.mp=500;
		this.attack = 10;
		this.armor = 5;
	}
	
	
	void bash(Player p) {
	if(this.mp <= 100) {
		System.out.println("스킬사용 할 수 없습니다.");
		return;
	}
		this.mp -= 100;
		System.out.println(p.name+"님에게때리기 스킬 적중");
		
		if(p instanceof Wizard) {
			p.hp -= 200;
		}else if(p instanceof Warrior) {
			p.hp -= 100;
		}
	}

	
}
