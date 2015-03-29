package assignment6.generator;

import java.util.Random;



public final class DatasetGenerator {

	private final int size;
	private final Random rnd = new Random(0);
	
	public DatasetGenerator() {
		this(10 * 1024 * 1024);
	}
	
	public DatasetGenerator(final int size) {
		this.size = size;
	}
	
	public final int[] generate() {
		
		final int[] result = new int[this.size];
		int rdseed = 10000;
		
		for (int i = 0; i < result.length; i++) {
			result[i] = this.rnd.nextInt(rdseed);
		}

		return result;
		
	}
	
}