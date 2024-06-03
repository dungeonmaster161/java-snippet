package Recursion;

import java.util.Scanner;

public class Factorial {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Digit");
		int n = sc.nextInt();
		//Method Overloading
		Codehunt ch = new Codehunt();
		System.out.println(ch.findFactorial(n));
}
