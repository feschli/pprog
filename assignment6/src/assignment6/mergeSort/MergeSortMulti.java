package assignment6.mergeSort;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

import assignment6.generator.DatasetGenerator;

public class MergeSortMulti extends RecursiveAction {

	private static final long serialVersionUID = 1531647254971804196L;

	public static void main(String[] a) {
		DatasetGenerator dg = new DatasetGenerator();
		long t0 = System.currentTimeMillis();
		MergeSortMulti.sort(dg.generate());
		long t1 = System.currentTimeMillis();
		System.out.println((t1 - t0) + " msec");
	}

	public static int[] sort(int[] input) {
		MergeSortMulti msm = new MergeSortMulti(input, 0, input.length);
		
		ForkJoinPool fjp = new ForkJoinPool();
		long t0 = System.currentTimeMillis();
		fjp.invoke(msm);
		long t1 = System.currentTimeMillis();
    System.out.println("For " + input.length + " MergeSort Multi takes " + (t1 - t0) + " msec");
		return msm.result;
	}
	
	private int[] result;
	private int[] input;
	private int start;
	private int length;
	
	private MergeSortMulti(int[] input, int start, int length) {
		this.result = new int[length];
		this.input = input;
		this.start = start;
		this.length = length;
	}
	
	private void computeDirectly() {
		
		/*
		 * Implement sequential sort which will sort this.input starting 
		 * from this.start of length this.length into this.result
		 */

		if (this.length == 1) {
			
			/*
			 * Simple case: input is only 1 number
			 */
			this.result[0] = this.input[this.start];
			
		} else if (this.length == 2) {

			/*
			 * Base case: input is two numbers. Return them in the correct 
			 * order. 
			 */
			
			if (this.input[this.start] > this.input[this.start + 1]) {
				this.result[0] = this.input[this.start + 1];
				this.result[1] = this.input[this.start];
			} else {
				this.result[0] = this.input[this.start];
				this.result[1] = this.input[this.start + 1];
			}

		}
		
	}
	
	protected void compute() {
		
		if (this.length <= 2) {

			this.computeDirectly();

		} else {
			
			/*
			 * Generic case: input is more than two numbers.
			 */
		
			int halfSize = (this.length) / 2;

			/*
			 * Sort first half
			 */
			MergeSortMulti firstHalf = 
				new MergeSortMulti(this.input, this.start, halfSize);
			
			/*
			 * Sort second half 
			 */
			MergeSortMulti secondHalf = 
				new MergeSortMulti(this.input, 
					this.start + halfSize, this.length - halfSize);
			
			/*
			 * FIXME: Make sure that they have executed.
			 */

			
			
			/*
			 * Merge the results
			 */
			this.merge(firstHalf.result, secondHalf.result, this.result);
			
		}
		
	}
	
	private void merge(int[] in1, int[] in2, int[] output) {

		int in1Position = 0;
		int in2Position = 0;
		int outputPosition = 0;
		/*
		 * FIXME: Write the merge algorithm which will merge in1 and in2 into 
		 * output in sorted way.
		 * 
		 * TIP: You can reuse the merge code from MergerSortSingleTest
		 */
	}

}
