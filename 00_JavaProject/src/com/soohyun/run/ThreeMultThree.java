package com.soohyun.run;

import java.util.Scanner;

public class ThreeMultThree {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int oneNum = sc.nextInt();
		int twoNum = sc.nextInt();
		
		// 세 자리 수 , 세 자리 수 곱하기.
		
		int one = twoNum % 10;
		int firstNum = oneNum * one;
		System.out.println(firstNum);
		
		int two = (twoNum/10)%10;
		int secondNum = (oneNum * two);
		System.out.println(secondNum);
		
		int three = twoNum/100;
		int thirdNum = (oneNum * three);
		System.out.println(thirdNum);
		
		System.out.println(firstNum + (secondNum * 10) + (thirdNum * 100));
		
	}

}
