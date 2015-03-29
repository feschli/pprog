package assignment6.mergeSort;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import assignment6.generator.DatasetGenerator;
import assignment6.mergeSort.MergeSortMulti;
import assignment6.mergeSort.MergeSortSingle;

public class MergeSortTest {
  
  @Test
  public void test100random() {
    
    DatasetGenerator dg = new DatasetGenerator(10000);
    int[] input = dg.generate();
    
   
    
    int[] resMulti = MergeSortSingle.sort(input);
    int[] resSingle = MergeSortMulti.sort(input);
    
    Arrays.sort(input);
    Assert.assertArrayEquals(resSingle, resMulti);
    Assert.assertArrayEquals(input, resMulti);
    
  }
  
  @Test
  public void testBigRandom() {
    
    DatasetGenerator dg = new DatasetGenerator(24 * 1024 * 1024);
    int[] input = dg.generate();
    
   
    int[] resMulti = MergeSortSingle.sort(input);
    int[] resSingle = MergeSortMulti.sort(input);
    
    
    Arrays.sort(input);
    Assert.assertArrayEquals(resSingle, resMulti);
    Assert.assertArrayEquals(input, resMulti);
    
  }
  
}
