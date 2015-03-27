package exercise2;

import chapter6.randomstuff;

public class mult {
	public static void main (String[] args){
		int year, date;
		String day, month;
		
		year = 2014;
		date = 24;
		day = "Monday";
		month = "March";
		
		System.out.println("American Format:");
		System.out.println(day+", "+month+" "+date+", "+year);
		System.out.println("European Format: "+'\n'+day+" "+date+" "+month+", "+year);
		
		System.out.println(randomstuff.area(3.0));
		
	}
}
