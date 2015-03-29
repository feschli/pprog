package assignment6.searchAndCount;

import org.junit.Assert;
import org.junit.Test;

import assignment6.searchAndCount.SearchAndCountMultiple;
import assignment6.searchAndCount.SearchAndCountSingle;
import assignment6.searchAndCount.Util;
import assignment6.searchAndCount.Util.Workload;

public class SearchAndCountTest {

	@Test
	public void test100HEAVYrandom() {

		DatasetGenerator dg = new DatasetGenerator(100);
		int[] testNumbers = dg.generate();
		int resSingle = SearchAndCountSingle.countNoAppearances(testNumbers, 2,
				Workload.HEAVY);
		int resMultiple = SearchAndCountMultiple.countNoAppearances(
				testNumbers, 2, Workload.HEAVY, 2);

		Assert.assertEquals(countTest(testNumbers, Workload.HEAVY), resSingle);
		Assert.assertEquals(countTest(testNumbers, Workload.HEAVY), resMultiple);

	}

	@Test
	public void test100Lightrandom() {

		DatasetGenerator dg = new DatasetGenerator(100);
		int[] testNumbers = dg.generate();
		int resSingle = SearchAndCountSingle.countNoAppearances(testNumbers, 2,
				Workload.LIGHT);
		int resMultiple = SearchAndCountMultiple.countNoAppearances(
				testNumbers, 2, Workload.LIGHT, 2);

		Assert.assertEquals(countTest(testNumbers, Workload.LIGHT), resSingle);
		Assert.assertEquals(countTest(testNumbers, Workload.LIGHT), resMultiple);

	}

	@Test
	public void test1000000HEAVYrandom() {

		DatasetGenerator dg = new DatasetGenerator(1000000);
		int[] testNumbers = dg.generate();
		int resSingle = SearchAndCountSingle.countNoAppearances(testNumbers,
				1000, Workload.HEAVY);
		int resMultiple = SearchAndCountMultiple.countNoAppearances(
				testNumbers, 1000, Workload.HEAVY, 2);

		Assert.assertEquals(countTest(testNumbers, Workload.HEAVY), resSingle);
		Assert.assertEquals(countTest(testNumbers, Workload.HEAVY), resMultiple);

	}

	@Test
	public void test1000000Lightrandom() {

		DatasetGenerator dg = new DatasetGenerator(1000000);
		int[] testNumbers = dg.generate();
		int resSingle = SearchAndCountSingle.countNoAppearances(testNumbers,
				100, Workload.LIGHT);
		int resMultiple = SearchAndCountMultiple.countNoAppearances(
				testNumbers, 100, Workload.LIGHT, 2);

		Assert.assertEquals(countTest(testNumbers, Workload.LIGHT), resSingle);
		Assert.assertEquals(countTest(testNumbers, Workload.LIGHT), resMultiple);

	}

	public int countTest(int input[], Util.Workload wt) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (Util.doWork(input[i], wt))
				count++;
		}
		return count;
	}
}
