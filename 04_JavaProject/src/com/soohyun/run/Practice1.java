package com.soohyun.run;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		if(num1<40) {
			num1 = 40;
		}else if(num2<40) {
			num2 = 40;
		}else if(num3<40){
			num3 = 40;
		}else if(num4<40) {
			num4 = 40;
		}else if(num5<40) {
			num5 = 40;
		}

	}

}
