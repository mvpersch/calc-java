package learningPackage;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci.loopFibonacci(Fibonacci.getNumberOfTerms());
	}
	
	/**
	 * Read user number of terms to calculate the series
	 * @return
	 */
	public static int getNumberOfTerms() {
		Scanner scan=new Scanner(System.in);
		System.out.println("*FIBONACCI*");
		System.out.println("Enter number of terms: ");   
		int n=scan.nextInt();
		scan.close();
		System.out.println("Fibonacci series is: ");
		return n;
	}
	
	/**
	 * Calculate Fibonacci sequence
	 */
	public static void calcFibonacci() {
		Fibonacci.loopFibonacci(Fibonacci.getNumberOfTerms());
	}
	
	/**
	 * Calculate Fibonacci sequence using for loop
	 */
	private static void loopFibonacci(int n) {
		int i=0,j=1,nextTerm;
		for(int k=0;k<n;k++) {
			if(k<=1)
				nextTerm=k;
			else {
				nextTerm=i+j;
				i=j;
				j=nextTerm;
			}
			System.out.println(nextTerm);
		}
	}
}
