package exercise2;

import java.util.Random;
import java.math.BigInteger;

public class AddNumbers {

	private final int[][] arr;

	public AddNumbers(int[][] arr) {
		this.arr = arr;
	}

	public long add() {
		long result = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				result = result * arr[i][j];
			}
		}
		return result;
	}

	public int[][] getArr() {
		return arr;
	}

	public void fillArray() {
		final Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr.length; k++) {
				this.arr[i][k] = rand.nextInt(500);
			}
		}

	}

	public static void main(String[] args) {
		int[][] numbers = {{10,11,12},{13,14,15},{16,17,18},{19,20,21}};
				
//				new int[10][10];

//		AddNumbers obj = new AddNumbers(numbers);
//		obj.fillArray();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// System.out.println(obj.add());

	}

}
