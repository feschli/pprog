package blabla;

import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Integer> {

	final int[] xs;
	final int h, l;

	public SumTask(final int[] xs, int l, int h) {

		super();
		this.xs = xs;
		this.h = h;
		this.l = l;
	}

	public SumTask(final int[] xs) {
		this(xs, 0, xs.length);
	}

	public Integer compute() {

		int size = h - l;
		if (size == 1)
			return xs[l];
		int mid = size / 2;
		SumTask t1 = new SumTask(xs, l, l + mid);
		SumTask t2 = new SumTask(xs, l + mid, h);
		t1.fork();
		Integer r2 = t2.compute();
		return r2 + t1.join();

	}

	public static void main(String[] args) {

		int[] arr = { 2, 5 };

		SumTask s = new SumTask(arr, 50, 20);

		System.out.println(s.toString());
	}
}