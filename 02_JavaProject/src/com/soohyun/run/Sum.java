package com.soohyun.run;

import java.util.Scanner;

public class Sum {

	    public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        
	        int sum = 0;
	        for(int i=0; i<=num; i++) {
	        	sum = sum + i;
	       
	        	System.out.println(sum);
	        }
	      //  System.out.println(sum);
	    }
}
