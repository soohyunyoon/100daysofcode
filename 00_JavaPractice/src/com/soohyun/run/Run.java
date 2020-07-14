package com.soohyun.run;

import java.util.Scanner;

import com.soohyun.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student[] s = new Student[10];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("학년을 입력하세요 : ");
			int SchoolYear = sc.nextInt();
			System.out.print("반을 입력하세요 : ");
			int classNum = sc.nextInt();
			sc.nextLine();
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine();
			System.out.print("국어점수 입력하세요 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 입력하세요 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 입력하세요 : ");
			int math = sc.nextInt();
			sc.nextLine();
			s[count] = new Student(SchoolYear, classNum, name, kor, eng, math);
			count++;
		
			System.out.print("계속 추가하시겠습니까? (y / n) : ");
			char yN = sc.nextLine().charAt(0);
			
//			if(yN == 'n') {
//				for(int i=0; i<count; i++) {
//					System.out.println(s[i].toString());
//				}
//				return;
//			}
			
			if(yN == 'y' || yN == 'Y') {
				continue;
			}else if (yN == 'n' || yN == 'N') {
				break;
			}
			
		}
		for(int i = 0; i < count ; i++) {
			System.out.println(s[i].toString());
		}
	}

}
