package chapter6;

// Write a method named isDivisible that takes two integers,
// n and m and that returns true if n is divisible by m and false otherwise.

public class ex6_1 {
	
	public static void main(String [] args){
		System.out.println(isDivisible(41.,20.));
	}
	
	public static boolean isDivisible(double n, double m){
		double div;
		div = (n/m)%1;
		if(div==0){
			return true;
		} else
			return false;			
	}
}
