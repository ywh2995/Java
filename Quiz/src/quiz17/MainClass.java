package quiz17;

public class MainClass {

	public static void main(String[] args) {
		Warrior me = new Warrior("강한친구대한전사");
		
		
		Wizard play2 = new Wizard("구르미그린마법사");
		Warrior play3 = new Warrior("전사약해요");
		
		System.out.println("----나의 캐릭 배쉬 스킬 사용 ----");
		me.bash(play2);
		me.bash(play3);
		
		me.bash(play2);
		me.bash(play3);

		
		me.bash(play3);
		me.bash(play3);
		me.bash(play3);
		me.bash(play3);
		
		play2.info();
		play3.info();
	
		System.out.println("=====================");
		Player[] arr= {me,play3};
		play2.Blizzard(arr);
		play2.Blizzard(arr);
	
		me.info();
		play3.info();
	
	}

}
