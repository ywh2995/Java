package quiz6;

public class Student {
	/*
	 * 멤버변수
	 * name - 학생이름
	 * no - 학생번호
	 * kor - 국어점수
	 * eng - 영어
	 * math - 수학
	 * 
	 * 생성자
	 * 5개다 초기화하는
	 * 
	 * getTotal() - 국영수 합계 반환
	 * getAvg() - 평균  반환(소수 2쨰)
	 * 
	 * main 학생 2명 각각생성 후 확인
	 */
	
	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	Student() {
	}
	Student(String pName,int pNo,int pKor,int pEng,int pMath ) {
		name=pName;
		no=pNo;
		kor=pKor;
		eng=pEng;
		math=pMath;
	}
	
	int getTotal() {
		int total = kor + eng + math;
		return total;
	}
	double getAvg() {
		double avg =(double)(kor + eng + math)/3;
		return avg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
