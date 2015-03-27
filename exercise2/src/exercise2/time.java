package exercise2;

public class time {
	public static void main(String[] args){
		double hour=16, 
			   minute=10, 
			   second=24, 
			   time_since_midnight, 
			   time_remaining, 
			   percentage;
		
		double i = 5.0/3.0;
		i = Math.round(i);
		double hoch = Math.pow(2.0,5.0);
		
		double root, angle, height;
		
		root = Math.sqrt(hour);
		angle = 2.3;
		height = Math.sin(angle);
		
		
		time_since_midnight = hour*60*60+minute*60+second;
		time_remaining = 24*60*60-time_since_midnight;
		percentage = 100-time_remaining/time_since_midnight*100;
		
		
		System.out.println("Haaaaai"+i);
		System.out.println("Since midnight, "+time_since_midnight+" seconds have passed.");
		System.out.println("Until midnight, "+time_remaining+" seconds are yet to pass.");
		newLine();
		System.out.println(hoch);
		System.out.println("So far, "+percentage+"% of the day have passed.");
		System.out.println("root = "+root+" and height = "+height);
		System.out.println();
		multi(3.0, 4.0);
		newLine();
		printTwice("goooooooogle");
	}
	
	public static void newLine(){
		System.out.println(" ");
	}
	
	public static void multi(double a, double b){
		double c;
		c = a*b;
		System.out.println(c);
	}
	
	public static void printTwice(String s){
		System.out.println(s);
		System.out.println(s);
	}

}
