package ch.ethz.infk.pprog.session4;

public class Threading {

	Thread[] threads0;
	Thread[] threads1;
	Thread[] threads2;
	Thread[] threads3;
	
	public Threading(int n){
		threads0 = new Thread[n];
		threads1 = new Thread[n];
		threads2 = new Thread[n];
		threads3 = new Thread[n];
	}
	
	//The shortest code: Anonymous in-line thread creation
	//Note that if start is called directly, it can be coded in one line.
	public void threadCreation0(){
		for (int i = 0; i< threads0.length; i++){
			final int j = i;
			threads0[i] = new Thread(){
				@Override
				public void run(){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(j);
					
				}
	
			};
		}
		for (Thread thread: threads0)
			thread.start();
	}
	
	//The unnecessary version: Anonymous in-line runnable creation
	//If you use an in-line class anyway, why use an extra wrapper?
	public void threadCreation1(){
		for (int i = 0; i< threads1.length; i++){
			final int j = i;
			threads1[i] = new Thread(new Runnable(){
				@Override
				public void run() {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("			" + j);
					
				}
	
			});
		}
		for (Thread thread: threads1)
			thread.start();
	}
	
	//The reusable thread version: Inheritance from Thread
	//You want to use the thread with a complex task that has some inner implementation (more than run)
	public void threadCreation2(){
		for (int i = 0; i< threads2.length; i++)
			threads2[i] = new MyThread(i);
		for (Thread thread: threads2)
			thread.start();
	}
	
	//The task/execution separation version: Standard Thread with inherited Runnable
	//You want to reuse the task object and possibly share it among many threads.
	public void threadCreation3(){
		for (int i = 0; i< threads3.length; i++)
			threads3[i] = new Thread(new ParallelOperation(i));
		for (Thread thread: threads3)
			thread.start();
	}
	
	public void interleavingOutput(){
		threadCreation0();
		threadCreation1();
		threadCreation2();
		threadCreation3();
	}
}
