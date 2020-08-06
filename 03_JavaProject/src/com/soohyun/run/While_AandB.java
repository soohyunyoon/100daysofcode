package com.soohyun.run;

import java.util.Scanner;

public class While_AandB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A+B!=0) {
				System.out.println(A+B);
			}else {
				break;
			}
		}

	}

}
