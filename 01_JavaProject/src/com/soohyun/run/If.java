package com.soohyun.run;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {   
		// ���� �Է¹ޱ�
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); 
        int B = sc.nextInt();
        
        if (A > B) { // A�� B���� Ŭ ���
            System.out.println(">");
        }else if (A < B) { // B�� A���� Ŭ ���
            System.out.println("<");
        }else if (A == B) {// A�� B�� ���� ���
            System.out.println("==");
        }
    }
}

	