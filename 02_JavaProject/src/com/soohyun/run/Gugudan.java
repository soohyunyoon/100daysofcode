package com.soohyun.run;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=1; i<10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i) );
        }
    }

}
