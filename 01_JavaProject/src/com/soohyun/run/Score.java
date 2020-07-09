package com.soohyun.run;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
    
	    if(score >= 90) { // 점수가 90점 이상
	        System.out.println("A");
	    }else if (score >= 80) { // 점수가 80점 이상
	        System.out.println("B");
	    }else if (score >= 70) { // 점수가 70점 이상
	        System.out.println("C");
	    }else if (score >= 60) { // 점수가 60점 이상
	         System.out.println("D");
	    }else {
	         System.out.println("F");
	    }
	}

}
