package com.soohyun.run;

import java.util.Scanner;

public class ForAandB {

	public static void main(String[] args) {
		// �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		// �Է¹��� �� ��ŭ �ݺ��� ������
		int T = sc.nextInt();
		int A, B;
		
		for(int i=0; i<T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println(A + B);
		}
	
	}

}
