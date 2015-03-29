package assignment6.mergeSort;

import assignment6.generator.DatasetGenerator;

public class MergeSortSingle {

	public final static void main(String[] a) {
		DatasetGenerator dg = new DatasetGenerator();
		long t0 = System.currentTimeMillis();
		MergeSortSingle.sort(dg.generate());
		long t1 = System.currentTimeMillis();
		System.out.println((t1 - t0) + " msec");
	}

	private MergeSortSingle() {}
	
	public static int[] sort(int[] input) {
	  long t0 = System.currentTimeMillis();
		int[] res = new MergeSortSingle().sort(input, 0, input.length);
		long t1 = System.currentTimeMillis();
    System.out.println("For " + input.length + " MergeSort Single takes " +(t1 - t0) + " msec");
		return res;
	}
	
	public int[] sort(int[] input, int start, int length) {

		int[] result = new int[length];
		
		if (length == 1) {
		
			/*
			 * Simple case: input is only 1 number
			 */
			result[0] = input[start];
			
		} else if (length == 2) {

			/*
			 * Base case: input is two numbers. Return them in the correct 
			 * order. 
			 */
			if (input[start] > input[start + 1]) {
				result[0] = input[start + 1];
				result[1] = input[start];
			} else {
				result[0] = input[start];
				result[1] = input[start + 1];
			}

		} else if (length > 2) {
			
			/*
			 * Generic case: input is more than two numbers.
			 */
			int halfSize = (length) / 2;

			/*
			 * FIXME: Sort first half
			 */
			int[] firstHalf = null;
			/*
			 * FIXME: Sort second half 
			 */
			int[] secondHalf = null;
			/*
			 * Merge the results
			 */
			this.merge(firstHalf, secondHalf, result);
			
		}
		
		return result;

	}
	
	private void merge(int[] in1, int[] in2, int[] output) {

		int in1Position = 0;
		int in2Position = 0;
		int outputPosition = 0;

		/*
		 * FIXME: Write the merge algorithm which will merge in1 and in2 into output in sorted way
		 */
		
	}

}
