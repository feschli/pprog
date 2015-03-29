package lesson6;

public class Test {

	public static int do_sum_rec(int[] xs, int l, int h) {

		int size = h - l;

		if (size == 1)
			return xs[l];
		int mid = size / 2;
		int sum1 = do_sum_rec(xs, l, l + mid);
		int sum2 = do_sum_rec(xs, l + mid, h);
		return sum1 + sum2;
	}
	
	public static void main(String[] args){
		
		int[] xs =  {1,4,7,5};
		
		System.out.println(do_sum_rec(xs,4,8));
		
		
	}
}
