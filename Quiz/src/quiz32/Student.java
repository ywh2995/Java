package quiz32;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {

	private String stuId;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private String grade;

	private Scanner sc = new Scanner(System.in);



	//학생정보 입력받기 메서드 반환 string
	public String inputStuInfo() {
		/*
		 * 학버 이름 국영수 입력받기
		 * 국영서 문자열 입력시 다시받을수 있도록 에외처리
		 */
		while(true) {

			
				System.out.print("학번 :");
				String stuId = sc.next();
				this.stuId = stuId;
				System.out.print("이름 :");
				String name= sc.next();
				this.name = name;
				try{	
				System.out.print("국어 :");
				int kor = sc.nextInt();
				this.kor = kor;
				System.out.print("영어 :");
				int eng = sc.nextInt();
				this.eng = eng;
				System.out.print("수학 :");
				int math = sc.nextInt();
				this.math = math;
				break;
			}catch(Exception e) {
				System.out.println("다시 입력해주세요:");
				sc.nextLine();
			}
		}
		return stuId;
	}



	//총점, 평균 학점 계싼
	public void calcTotAvg() {
		/*
		 * 합계 평균 등급 나눠서 멤버변수저장
		 */
		this.total = this.kor+this.eng+this.math;
		this.avg = this.total/3.0;
		if(this.avg>=90) {
			this.grade = "A";
			

		}else if(this.avg>80) {
			this.grade = "B";
			
		}else if(this.avg>70) {
			this.grade = "C";
			
		}else if(this.avg>60) {
			this.grade = "D";
			
		}else {
			this.grade = "F";
		}

	}	



	//학생정보출력
	public void outputInfo() {
		System.out.printf("%4s%6s%11d점%11d점%11d점%11d점%11.2f점%10s\n"
				, this.stuId, this.name, this.kor, this.eng
				, this.math, this.total, this.avg, this.grade);
	}



	public String getStuId() {
		return stuId;
	}



	public void setStuId(String stuId) {
		this.stuId = stuId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getKor() {
		return kor;
	}



	public void setKor(int kor) {
		this.kor = kor;
	}



	public int getEng() {
		return eng;
	}



	public void setEng(int eng) {
		this.eng = eng;
	}



	public int getMath() {
		return math;
	}



	public void setMath(int math) {
		this.math = math;
	}



	public int getTotal() {
		return total;
	}



	public void setTotal(int total) {
		this.total = total;
	}



	public double getAvg() {
		return avg;
	}



	public void setAvg(double avg) {
		this.avg = avg;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public Scanner getSc() {
		return sc;
	}



	public void setSc(Scanner sc) {
		this.sc = sc;
	}

}



