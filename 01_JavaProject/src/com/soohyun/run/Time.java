package com.soohyun.run;

import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M > 45) {
			if(H==0) {
				H = 23;
				System.out.println(H + " " + (M+15));
			}else {
				H--;
				System.out.println(H + " " + (M+15));
			}
		}else {
			System.out.println(H + " " + (M-45));	
		}
	}
}
