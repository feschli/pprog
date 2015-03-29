package ch.ethz.infk.pprog.session4;


public class Main {

	
	public static void main(String[] args) {
		
		Threading threading = new Threading(5);
		threading.interleavingOutput();	
		
		/* run the thread join example */		
		//ThreadJoinExample.run();
	}
}
