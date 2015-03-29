package ch.ethz.infk.pprog.session4;

public class MyThread extends Thread {
	
	private int index;
	
	public MyThread(int i){
		this.index = i;
	}
	
	
	@Override
	public void run(){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("		" + index);
		
	}
}
