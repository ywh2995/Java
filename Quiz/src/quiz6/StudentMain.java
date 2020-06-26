package quiz6;

public class StudentMain {

	public static void main(String[] args) {
		
		Student p1 = new Student("홍길동",1,84,73,91);
		int total = p1.getTotal();
		double avg = p1.getAvg();
		System.out.printf("%s학생의 총합 : %d, 평균 : %.2f",p1.name,total,avg);
				

	}

}
