package com.soohyun.run;

import java.util.Scanner;

import com.soohyun.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student[] s = new Student[10];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�г��� �Է��ϼ��� : ");
			int SchoolYear = sc.nextInt();
			System.out.print("���� �Է��ϼ��� : ");
			int classNum = sc.nextInt();
			sc.nextLine();
			System.out.print("�̸��� �Է��ϼ��� : ");
			String name = sc.nextLine();
			System.out.print("�������� �Է��ϼ��� : ");
			int kor = sc.nextInt();
			System.out.print("�������� �Է��ϼ��� : ");
			int eng = sc.nextInt();
			System.out.print("�������� �Է��ϼ��� : ");
			int math = sc.nextInt();
			sc.nextLine();
			s[count] = new Student(SchoolYear, classNum, name, kor, eng, math);
			count++;
		
			System.out.print("��� �߰��Ͻðڽ��ϱ�? (y / n) : ");
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
