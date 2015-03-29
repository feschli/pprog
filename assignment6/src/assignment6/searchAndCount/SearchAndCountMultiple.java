package assignment6.searchAndCount;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

import assignment6.searchAndCount.Util.Workload;

public class SearchAndCountMultiple extends RecursiveTask<Integer> {

	private int[] input;
	private int start;
	private int finish;
	private int cutOff;
	private Util.Workload workloadType;

	private SearchAndCountMultiple(int[] input, int start, int finish,
			int cutOff, Util.Workload wt) {
		this.input = input;
		this.start = start;
		this.finish = finish;
		this.cutOff = cutOff;
		this.workloadType = wt;
	}

	private static final long serialVersionUID = 3396462358908632200L;

	public final static void main(String[] a) {
		int[] input = new int[100000000];
		Arrays.fill(input, 1);

		long t0 = System.currentTimeMillis();
		int res = SearchAndCountMultiple.countNoAppearances(input, 1000,
				Workload.HEAVY, 2);
		long t1 = System.currentTimeMillis();
		System.out.println("count is " + res);
		System.out.println((t1 - t0) + " msec");
	}

	public static Integer countNoAppearances(int[] input, int cutOff,
			Util.Workload wt, int noThreads) {
		SearchAndCountMultiple countapp = new SearchAndCountMultiple(input, 0,
				input.length, cutOff, wt);
		ForkJoinPool fjp = new ForkJoinPool(noThreads);
		long t0 = System.currentTimeMillis();
		int num = fjp.invoke(countapp);
		long t1 = System.currentTimeMillis();
		System.out.println("For (inputsize=" + input.length + ",cutoff="
				+ cutOff + ",workload=" + wt + ",nothreads=" + noThreads
				+ ") SearchAndCount Multiple takes " + (t1 - t0) + " msec");

		return num;
	}

	// This method has to count all the appearances of elem from
	// first to last-1 inclusively
	@Override
	protected Integer compute() {
    

		// TODO 
	  // You are asked to implement the compute function be splitting the work in 
	  // Tasks as described in the sum example from the exercise slides 
	  
	  // you can modify this return
	  return null;

	}

}