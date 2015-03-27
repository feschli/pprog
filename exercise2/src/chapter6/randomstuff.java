package chapter6;

public class randomstuff {
	public static void main(String[] args){
		System.out.println(distance(1.,2.,4.,6.));
		System.out.println();
		System.out.println(circleArea(1.,2.,4.,6.));
		System.out.println(area(4.0));
		System.out.println();
		System.out.println("* * * * *");
		System.out.println();
		
		double n=4;
		boolean evenFlag = (n%2 == 0);
		if (evenFlag)
			System.out.println("n was even when I checked it");
		
		System.out.println();
		
		System.out.println(isSingleDigit(5));
		
		System.out.println(fibonacci(2));
		
		
	}
	
	public static double distance(double x1, double y1, double x2, double y2){
		double dx = x2-x1; //calculates the distance between two points
		double dy = y2-y1;
		double sqx = Math.pow(dx, 2);
		double sqy = Math.pow(dy, 2);
		double dsquared = sqx + sqy;
		double result = Math.sqrt(dsquared);
		return result;
	}
	
	public static double area(double radius){ // calculates area of a circle, given the radius
		double area = radius*radius*Math.PI;
		return area;
	}
	
	public static double circleArea(double xc, double yc, double xp, double yp){ // calculates area of a circle, given circle's center and random point on circle
		double radius = distance(xc, yc, xp, yp);
		double area = area(radius);
		return area;
		}
	
	public static boolean isSingleDigit(int x){ // checks whether a number has only one digit
		if(x>=0 && x<10){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static int fibonacci(int n){ // calculates fibonacci
		if(n==0 || n==1)
			return 1;
		else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	
}
