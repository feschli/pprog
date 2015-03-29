package assignment6.searchAndCount;

import java.util.Arrays;

public class SearchAndCountSingle {

	private int[] input;
	private final int cutOff;
	Util.Workload workloadType;

	private SearchAndCountSingle(int[] input, int cutOff, Util.Workload wt) {
		this.input = input;
		this.cutOff = cutOff;
		this.workloadType = wt;
	}

	public final static void main(String[] a) {
		int[] input = new int[100000000];
		Arrays.fill(input, 1);

		long t0 = System.currentTimeMillis();
		int res = SearchAndCountSingle.countNoAppearances(input, 1000,
				Util.Workload.HEAVY);
		long t1 = System.currentTimeMillis();
		System.out.println("count is " + res);
		System.out.println((t1 - t0) + " msec");
	}

	public static int countNoAppearances(int[] input, int cutOff,
			Util.Workload wt) {
		long t0 = System.currentTimeMillis();
		int num = new SearchAndCountSingle(input, cutOff, wt).count(0,
				input.length);
		long t1 = System.currentTimeMillis();
		System.out.println("For (inputsize=" + input.length + ",cutoff="
				+ cutOff + ",workload=" + wt + ") SearchAndCount Single takes "
				+ (t1 - t0) + " msec");
		return num;

	}

	// This method has to count all the appearances of elem from
	// first to last-1 inclusively
	private int count(int start, int finish) {

		if ((finish - start) < cutOff) {
			int count = 0;
			for (int i = start; i < finish; i++) {
				if (Util.doWork(input[i], workloadType))
					count++;
			}

			return count;
		}
		int middle = (start + finish) / 2;
		return count(start, middle) + count(middle, finish);

	}

}