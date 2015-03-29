package ch.ethz.infk.pprog.session4;

public class ThreadJoinExample {

	private static final int NUM_THREADS = 4;

	/**
	 * starts the example program for creating threads
	 * 
	 * @param wait
	 *            true: Wait for the threads to be finished false: proceed with
	 *            the execution
	 */
	private static void runThreads(boolean wait) {

		// allocate an array of threads
		Thread[] threads = new Thread[NUM_THREADS];

		// create the threads
		for (int t = 0; t < threads.length; ++t) {

			// directly override the run method of the threads
			threads[t] = new Thread(new Runnable() {

				@Override
				public void run() {
					// getting the thread ID for demonstration purpose
					long threadId = Thread.currentThread().getId();
					System.out.println("Thread " + threadId + " started. ");
					try {
						// print the loop variable and sleep some time
						for (int i = 0; i < 10; ++i) {
							System.out.println("Thread " + threadId
									+ " is in loop " + i);
							Thread.sleep(100);
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Thread " + threadId + " terminated. ");
				}

			});
		}

		System.out.println("--> Starting Threads...");

		for (Thread t : threads) {
			t.start();
		}

		if (wait) {
			System.out.println("--> Waiting for threads to be done...");

			// wait for the threads to be finished
			for (Thread t : threads) {
				try {
					t.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("--> Done.");
	}

	public static void run() {
		
		System.out.println("Thread Join Example..");
		System.out.println("============================");
		runThreads(true);
		System.out.println("============================");
		runThreads(false);
		System.out.println("============================");
		System.out.println("done.");
		/*
		 * XXX: force the program to exit. this will kill also the other threads
		 * Otherwise: main tread terminates and the other threads will run to
		 * completion
		 */
		System.exit(0);
	}
}
