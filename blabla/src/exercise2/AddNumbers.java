package exercise2;

import java.util.Random;

public class AddNumbers {

	private  final int[] arr;

	public AddNumbers(int[] arr) {
		this.arr = arr;
	}

	public int add() {
		int result = 1;

		for (int i = 0; i < arr.length; i++) {
			result = result * arr[i];
		}
		return result;
	}

	public int[] getArr() {
		return arr;
	}
	
	public void fillArray(){
		final Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			this.arr[i] = rand.nextInt(10000);
		}
		
	}

	public static void main(String[] args) {
		int[] numbers = new int[10000];

		AddNumbers obj = new AddNumbers(numbers);
		obj.fillArray();
		
		for (int i = 0; i < obj.arr.length; i++) {
			System.out.print(obj.arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println(obj.add());

	}

}
