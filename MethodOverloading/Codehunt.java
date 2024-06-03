package MethodOverloading;
import java.util.Scanner;


public class Codehunt {

	public void sum(int a,int b) {
		System.out.println("This is sum with two int param");
	}
	
	public void sum(float b,int a) {
		System.out.println("Sum with float on first and int on second");
	}
	
	public void sum(int a) {
		System.out.println("Sum with single in parsams");
	}
	
	public void sum() {
		System.out.println("Sum with no paarams");
	}
}

