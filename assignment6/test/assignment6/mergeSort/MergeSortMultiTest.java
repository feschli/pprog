package assignment6.mergeSort;

import org.junit.Assert;
import org.junit.Test;

import assignment6.generator.DatasetGenerator;
import assignment6.mergeSort.MergeSortMulti;


public class MergeSortMultiTest {

	@Test
	public void test100() {

		int[] testNumbers = new int[100];
		testNumbers[34] = 1;
		int[] res = MergeSortMulti.sort(testNumbers);
		
		Assert.assertEquals(testNumbers.length, res.length);
		for (int i = 0; i < testNumbers.length - 1; i++) {
			Assert.assertEquals(0, res[i]);
		}
		Assert.assertEquals(1, res[res.length - 1]);
		
		
	}
	
	@Test
	public void test100random() {

		DatasetGenerator dg = new DatasetGenerator(100);
		int[] res = MergeSortMulti.sort(dg.generate());
		
		Assert.assertEquals(100, res.length);
		int last = Integer.MIN_VALUE;
		for (int i = 0; i < res.length - 1; i++) {
			Assert.assertTrue(last <= res[i]);
			last = res[i];
		}
		
	}
	
	
	@Test
	public void test100000random() {

		DatasetGenerator dg = new DatasetGenerator(10000);
		int[] res = MergeSortMulti.sort(dg.generate());
		
		Assert.assertEquals(10000, res.length);
		int last = Integer.MIN_VALUE;
		for (int i = 0; i < res.length - 1; i++) {
			Assert.assertTrue(last <= res[i]);
			last = res[i];
		}
		
	}

	
	@Test
	public void testZeros() {

		int[] res = MergeSortMulti.sort(new int[1000000]);
		
		Assert.assertEquals(1000000, res.length);
		int last = Integer.MIN_VALUE;
		for (int i = 0; i < res.length - 1; i++) {
			Assert.assertTrue(last <= res[i]);
			last = res[i];
		}
		
	}
}
