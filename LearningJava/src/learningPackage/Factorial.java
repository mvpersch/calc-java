package learningPackage;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");   
		n=sc.nextLong();
		sc.close();
		Factorial.loopFactorial(n);
		Factorial.recursiveFactorial(n);
	}
	
	/**
	 * Calculate Factorial loop/recursive
	 */
	public static void calcFactorial() {
        long n;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number: ");
	    n=sc.nextLong();
	    sc.close();
	    Factorial.loopFactorial(n);
	    Factorial.recursiveFactorial(n);    
	}
	
	/**
	 * Calculate Factorial using Loop
	 */
	private static void loopFactorial(long n) {
		int fact = 1;
	    for(int i=1;i<=n;i++){
	    	fact=fact*i;
	    }
	    System.out.println("Loop Factorial: "+fact);
	}
	
	/*
	 * Calculate Factorial using Recursion
	 */
	private static void recursiveFactorial(long n) {
		long fact = Factorial.calcRecursiveFactorial(n);
		System.out.println("Recursive Factorial: "+fact);
	}
	
	private static long calcRecursiveFactorial(long n) {
		if(n<=0)
			return 1;
	    return Factorial.calcRecursiveFactorial(n-1)*n; 
	}

}
