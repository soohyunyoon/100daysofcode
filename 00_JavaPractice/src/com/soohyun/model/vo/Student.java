package com.soohyun.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {}

	public Student(int grade, int classroom, String name, int kor, int eng, int math) {
		super();
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getGrade() {
		return grade;
	}

	void setGrade(int grade) {
		this.grade = grade;
	}

	int getClassroom() {
		return classroom;
	}

	void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getKor() {
		return kor;
	}

	void setKor(int kor) {
		this.kor = kor;
	}

	int getEng() {
		return eng;
	}

	void setEng(int eng) {
		this.eng = eng;
	}

	int getMath() {
		return math;
	}

	void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", classroom=" + classroom + ", name=" + name + ", kor=" + kor + ", eng="
				+ eng + ", math=" + math + "]";
	}
	
	

}
