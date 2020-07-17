package com.soohyun.run;

import java.util.Scanner;

public class AandBandC {
	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	     int A = sc.nextInt();
	     int B = sc.nextInt();
	     int C = sc.nextInt();
<<<<<<< HEAD

=======
		
>>>>>>> refs/remotes/origin/master
	     System.out.println((A+B)%C);
	     System.out.println(((A%C) + (B%C))%C);
	     System.out.println((A*B)%C);
	     System.out.println(((A%C) * (B%C))%C);

	}
}
