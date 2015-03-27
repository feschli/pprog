package chapter6;

public class Ex6_5 {
/*	public static void main(String[] args){
		
		
		
	}*/
	
	public static void distance(double x1, double y1, double x2, double y2){
		
		double x = (x2-x1)*(x2-x1);
		double y = (y2-y1)*(y2-y1);
		
		double distance = Math.sqrt((x+y));
		
		//System.out.println(distance(3,4,5,6));
	}
}
