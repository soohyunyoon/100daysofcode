package com.soohyun.run;

import java.util.Scanner;

public class ThreeMultThree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int oneNum = sc.nextInt();
		sc.nextLine();
		String twoNum = sc.nextLine();
		char one = twoNum.toString().charAt(0);
		char two = twoNum.toString().charAt(1);
		char three = twoNum.toString().charAt(2);
		
		int[] tArr = {one, two, three};
		
		System.out.println(tArr.toString());
		for(int i=0; i<tArr.length; i++) {
			System.out.println(tArr[i]);
		}
		
	}

}
