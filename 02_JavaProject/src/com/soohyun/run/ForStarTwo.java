package com.soohyun.run;

import java.util.Scanner;

public class ForStarTwo {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int star = sc.nextInt();
	    
		for(int i=1; i<=star;i++) {
			for(int j=star;j>0;j--) {
				if(j<=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");					
				}
			}
			System.out.println();
		}
	}
}

