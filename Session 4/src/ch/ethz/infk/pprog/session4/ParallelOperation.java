package ch.ethz.infk.pprog.session4;

public class ParallelOperation implements Runnable{
	
	private int index;
	
	public ParallelOperation(int i){
		this.index = i;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("	" + index);
	}
	
}