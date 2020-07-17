package com.soohyun.run;

import java.util.Scanner;

public class ForAandB {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		// 입력받은 수 만큼 반복문 돌리기
		int T = sc.nextInt();
		int A, B;
		
		for(int i=0; i<T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println(A + B);
		}
	
	}

}
