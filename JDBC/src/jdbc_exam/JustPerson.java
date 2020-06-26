package jdbc_exam;

public class JustPerson implements Person{
	
	String name;
	boolean is_infected = false;
	
	public JustPerson(String name, boolean is_infected) {
		super();
		this.name = name;
		this.is_infected = is_infected;
	}
	
	
	public void Isolation() {
		System.out.println("시설 격리 중입니다");
	}
	public void House_Isolation() {
		System.out.println("자가 격리 중입니다");
	}
	public void Report() {
		System.out.println("다른 사람을 신고했습니다");
	}
	
	public boolean isIs_infected() {
		return is_infected;
	}
	public void setIs_infected(boolean is_infected) {
		this.is_infected = is_infected;
	}
	public void NightLife() {		//유흥업소 출입
		double d = Math.random();
		System.out.println("일반인 " + name + "은(는) 유흥업소에 출입했습니다");
		if(d >= 0.5) {
			System.out.println("일반인 " + name + "은(는) 감염되었습니다");
			is_infected = true;
		}
		else if(d < 0.5) {
			System.out.println("일반인 " + name + "은(는) 감염되지 않았습니다");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
