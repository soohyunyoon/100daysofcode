package com.soohyun.run;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
			int year = sc.nextInt();
		    
		    if (year >= 1 && year <= 4000) { // ������ 1���� ũ�ų� ����, 4000���� �۰ų� ����
			    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { // 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ��
			        System.out.println("1"); // 1���
			    } else { 
			        System.out.println("0");
			    }
		    }
	}

}
