package chapter6;

public class Ex6_6 {
	
	public static void main(String[] args){
		System.out.println(prod(1, 4));
	}

	
	public static int prod(int m, int n){
		int product_m = 1;
		for ( int i=1; i <= m; i++){
			product_m *= i;
		}
		
		int product_n = 1;
		for(int i=1; i<= n; i++){
			product_n *= i;
			}
		
		int product = product_n - product_m;
		return product;
		}
	}

	

//  ??

