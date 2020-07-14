package com.soohyun.run;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
			int year = sc.nextInt();
		    
		    if (year >= 1 && year <= 4000) { // 연도는 1보다 크거나 같고, 4000보다 작거나 같다
			    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { // 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
			        System.out.println("1"); // 1출력
			    } else { 
			        System.out.println("0");
			    }
		    }
	}

}
