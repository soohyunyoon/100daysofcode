package com.soohyun.run;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {   
		// 숫자 입력받기
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); 
        int B = sc.nextInt();
        
        if (A > B) { // A가 B보다 클 경우
            System.out.println(">");
        }else if (A < B) { // B가 A보다 클 경우
            System.out.println("<");
        }else if (A == B) {// A와 B가 같을 경우
            System.out.println("==");
        }
    }
}

	