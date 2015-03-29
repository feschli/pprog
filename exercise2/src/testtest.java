
import java.util.concurrent.TimeUnit;

public class testtest {

	public static void main(String[] args) {
		Thread[] threadlist = new Thread[7];
		for (int i = 0; i < 7; i++) {
			Thread t = new Thread() {
				public void run() {
					System.out.println("hello i am thread " + this.getName());
				}
			};
			threadlist[i] = t;
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t.start();
		}
		System.out.println("All threads started.");
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (Thread t : threadlist) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	// private static class MyOperation implements Runnable{
	// private final int hi;
	//
	// public MyOperation(int a){
	// this.hi = a;
	// }
	// public void run(){
	// for (int i = 0; i < hi; i++) {
	// System.out.println("Hi There. I belong to " + hi);
	// }
	// }
	// }
	//
	// public static void main(String[] args){
	// Thread[] threadlist = new Thread[5];
	// for (int i = 1; i < 6; i++) {
	// MyOperation po = new MyOperation(i);
	// Thread t = new Thread(po);
	// threadlist[i-1] = t;
	// t.start();
	// }
	//
	// for(Thread t : threadlist){
	// try {
	// t.join();
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	// }
}