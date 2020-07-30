package com.soohyun.run;

import java.util.Scanner;

public class ThreeMultThree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int oneNum = sc.nextInt();
		int twoNum = sc.nextInt();
		
		int ill = twoNum % 10;
		System.out.println(oneNum * ill);
		int e = (twoNum/10)%10;
		System.out.println(oneNum * e);
		int sam = twoNum/100;
		System.out.println(oneNum * sam);
		System.out.println(oneNum * ill + (oneNum * e) * 10 + (oneNum * sam) * 100 );
		
	}

}
